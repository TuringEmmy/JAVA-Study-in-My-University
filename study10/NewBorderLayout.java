package cn.legeyung.study10;

import java.awt.*;

/**
 * �߽粼�֣�
 * @author Ӻ���(Lege_Yung)
 *
 */
public class NewBorderLayout extends Frame {
    //����5����ť���ֱ�����������ϡ������С�
    Button b1 = new Button("��");
    Button b2 = new Button("��");
    Button b3 = new Button("��");
    Button b4 = new Button("��");
    Button b5 = new Button("��");

    NewBorderLayout() {
        //���ô�������������
        this.setTitle("�߽粼�ֹ�����ʾ��");
        //���ò���
        this.setLayout(new BorderLayout());
        //��Ӱ�ť������λ��
        this.add(b1, BorderLayout.EAST);
        this.add(b2, BorderLayout.WEST);
        this.add(b3, BorderLayout.SOUTH);
        this.add(b4, BorderLayout.NORTH);
        this.add(b5, BorderLayout.CENTER);
        //���ô��ڵ���ʾλ���Լ���С
        this.setBounds(100, 100, 250, 250);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new NewBorderLayout();
    }
}

