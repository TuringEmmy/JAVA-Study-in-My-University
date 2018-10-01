package org.gaozou.book.javaabc.examples.ch25;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;

/**
 * @author TuringEmmy
 *
 */
public class HTMLTest extends JFrame {
    private JPanel contentPane;
    private JPanel mainPanel = new JPanel();
    //����URL�����
    private JTextField urltext = new JTextField();
    //����ҳ����ʾ
    private JEditorPane htmlPanl = new JEditorPane();

    public HTMLTest() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //�����رհ�ť���Զ��˳������ͷ���Դ
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void jbInit() throws Exception {
        contentPane = (JPanel) getContentPane();
        //���ò���
        contentPane.setLayout(new BorderLayout());
        mainPanel.setLayout(new BorderLayout());
        //������ʾ
        JLabel promptlabel = new JLabel("��������ַ");
        urltext.setText("http://");
        //���ü�������������URL��Enter���Զ���ȡ��ҳ����
        urltext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setPaneContent(urltext.getText());
            }
        });
        //����htmlPaneΪ���ɱ༭
        htmlPanl.setEditable(false);
        //����¼���������������������ʱ���Զ���ȡ��������
        htmlPanl.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                hyperlinkUpdate(e);
            }
        });
        //��ӹ�����
        JScrollPane scrollpane = new JScrollPane();
        scrollpane.getViewport().add(htmlPanl);
        mainPanel.add(urltext, BorderLayout.NORTH);
        mainPanel.add(scrollpane, BorderLayout.CENTER);
        contentPane.add(promptlabel, BorderLayout.NORTH);
        contentPane.add(mainPanel, BorderLayout.CENTER);
        this.setSize(new Dimension(600, 500));
        this.setTitle("�����");
        this.setVisible(true);
    }
    //��URL������ʾ��htmlPane��

    public void setPaneContent(String url) {
        try {
            htmlPanl.setPage(url);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "URL��ַ����ȷ��" + urltext.getText(), "���벻��ȷ", 0);
        }
    }
    //��������������ʾ��htmlPane��

    public void hyperLinkUpdate(HyperlinkEvent e) {
        if (e.getEventType() == javax.swing.event.HyperlinkEvent.EventType.ACTIVATED) {
            URL url = e.getURL();
            setPaneContent(url.toString());
        }
    }

    public static void main(String[] args) {
        new HTMLTest();
    }
}

