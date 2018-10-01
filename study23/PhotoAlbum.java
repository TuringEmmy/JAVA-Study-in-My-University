package org.gaozou.book.javaabc.examples.ch24;

import java.applet.Applet;
import java.awt.*;

/**
 * @author TuringEmmy
 *
 */
public class PhotoAlbum extends Applet {
    private Choice myChoice;// ����Choice����
    private String[] myString1, myString2;// ����String���͵�����
    private int totalPics;// ����һ��int�ͱ���
    private Image offI;// ����Image����
    private Image[] img;// ����һ��Image��������
    private Graphics offG;// ����һ��Graphics����
    private MediaTracker imagetracker;// ����һ��MediaTracker����

    public void init() {// ��AppletС������г�ʼ��
        this.setSize(600, 450);
        this.setLayout(null);
        myChoice = new Choice();
        myChoice.setBounds(10, 10, 290, 20);
        totalPics = 8;
        myString1 = new String[totalPics];
        myString2 = new String[totalPics];
        img = new Image[totalPics];
        for (int i = 0; i < totalPics; i++) {
            myString1[i] = new String("");
            myString2[i] = new String("");
        }
        String s = new String("");
        imagetracker = new MediaTracker(this);// ����ͼƬ
        for (int i = 0; i < totalPics; i++) {
            s = "�� " + (i + 1) + " ����Ƭ";
            myString1[i] = s;
            System.out.println(myString1[i]);
            myChoice.addItem(s);// �������б�������ѡ��
            s = (i + 1) + ".jpg";
            myString2[i] = s;
            img[i] = getImage(getDocumentBase(), s);
            imagetracker.addImage(img[i], 0);
        }
        try {
            imagetracker.waitForID(0);
        } catch (InterruptedException e) {
        }
        add(myChoice);
        offI = createImage(getSize().width, getSize().height - 40);// ����ͼ��
        offG = offI.getGraphics();
        offI = img[0];
        offG.drawImage(offI, 0, 0, this);
        repaint();
    }

    public void paint(Graphics g) {
        g.drawImage(offI, 10, 40, this);
    }
    // ʹ��action()���������Java AppletС��������ʱ���������¼�

    public boolean action(Event e, Object o) {
        if (e.target == myChoice) {
            // String s = new String("");
            offG.setColor(this.getBackground());
            offG.fillRect(0, 40, getSize().width, getSize().height - 40);
            offI = img[myChoice.getSelectedIndex()];
            offG.drawImage(offI, 0, 0, this);
            repaint();
        }
        return true;
    }
}
