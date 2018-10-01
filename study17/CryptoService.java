package org.gaozou.book.javaabc.examples.ch17;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/**
 * @author TuringEmmy
 *
 */
public class CryptoService extends JComponent {
    private BufferedImage image;            // ����һ��BufferedImage�����
    private Dimension imageOfSize;        // ����һ��Dimension�����
    private volatile int currOffset;            // ����һ�����ڱ�ʾƫ�����ı���
    private Thread thread;                // ����һ���߳�
    private volatile boolean flag;

    public CryptoService(String text) {        //���췽��Ϊ����Ա������ֵ
        currOffset = 0;                    //���õ�ǰ��ֵ
        buildImage(text);                //�����Զ��巽��buildImage()
        setMinimumSize(imageOfSize);    //�����������С�ߴ�
        setPreferredSize(imageOfSize);    //�����������ѡ�ߴ�
        setMaximumSize(imageOfSize);    //������������ߴ�
        setSize(imageOfSize);
        flag = true;
        Runnable r = new Runnable() {        //ʵ�ֽӿ��ڲ���

            public void run() {
                try {
                    ScrollING();
                } catch (Exception x) {
                    x.printStackTrace();
                }
            }
        };
        thread = new Thread(r, "ScrollText");
        thread.start();
    }

    private void buildImage(String text) {
        //���ݿ������ʾ���Ϳ������ʾֵ������һ��RenderingHints�����
        RenderingHints renderHints = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        //��ָ���ĳ�����ʾ��ӳ�䵽��RenderingHints�����е�ָ������ָʾֵ��
        renderHints.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        //����һ������ΪԤ�����ͼ��
        BufferedImage scratchImage = new BufferedImage(1, 1,
                BufferedImage.TYPE_INT_RGB);
        //����һ��Graphics2D�����
        Graphics2D scratchG2 = scratchImage.createGraphics();
        //���ó����㷨
        scratchG2.setRenderingHints(renderHints);
        //����һ��Font�������
        Font font = new Font("Serif", Font.BOLD | Font.ITALIC, 24);
        //����һ��FontRenderContext����
        FontRenderContext frc = scratchG2.getFontRenderContext();
        //����һ��TextLayout����
        TextLayout tl = new TextLayout(text, font, frc);
        //����һ��Rectangle2D����
        Rectangle2D textBounds = tl.getBounds();
        // �������ֵ���ʾ���
        int textWidth = (int) Math.ceil(textBounds.getWidth());
        // �������ֵ���ʾ����
        int textHeight = (int) Math.ceil(textBounds.getHeight());
        int horizontalPad = 10;            // ����ˮƽ���Ϊ10����
        int verticalPad = 6;            // ���ô�ֱ���Ϊ6����
        imageOfSize = new Dimension(    // ����Dimension����
                textWidth + horizontalPad, textHeight + verticalPad);
        image = new BufferedImage(
                imageOfSize.width, imageOfSize.height,
                BufferedImage.TYPE_INT_RGB);     // ����BufferedImage����
        Graphics2D g2 = image.createGraphics();
        g2.setRenderingHints(renderHints);
        int baselineOffset = (verticalPad / 2) - ((int) textBounds.getY()); // ���ߵ�ƫ����
        g2.setColor(Color.black);                // ��Ϊ��ɫ��Ӱ
        g2.fillRect(0, 0, imageOfSize.width, imageOfSize.height);
        g2.setColor(Color.WHITE);                // ��ɫ����
        tl.draw(g2, 0, baselineOffset);
        scratchG2.dispose();
        scratchImage.flush();
        g2.dispose();
    }

    public void paint(Graphics g) {
        // ����ǰ�ļ���������Ϊ�ɸ�������ָ���ľ��Ρ�
        g.setClip(0, 0, imageOfSize.width, imageOfSize.height);
        int localOffset = currOffset;             // ����ƫ�����ǲ��ϵı仯��
        g.drawImage(image, -localOffset, 0, this);
        g.drawImage(image, imageOfSize.width - localOffset, 0, this);
        // �滭���߿�
        g.setColor(Color.red);
        g.drawRect(0, 0, imageOfSize.width - 1, imageOfSize.height - 1);
    }

    private void ScrollING() {                    // ִ�й�������
        while (flag) {
            try {
                Thread.sleep(100);
                currOffset = (currOffset + 1) % imageOfSize.width;
                repaint();
            } catch (InterruptedException x) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        //����CryptoService�����
        CryptoService st = new CryptoService("��Һ�....");
        JPanel p = new JPanel(new FlowLayout());    //����һ���в��ֵ�������
        p.add(st);
        JFrame f = new JFrame("����������");        //����һ����ܶ���
        f.setContentPane(p);
        f.setSize(400, 100);
        f.setVisible(true);
    }
}

