package cn.legeyung.study10;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

/**
 * ���񲼾�
 * @author Ӻ���(Lege_Yung)
 *
 */
public class NewGridLayout {
    public static void main(String[] args) {
        //������������������
        Frame f = new Frame("����һ�����񲼾�ʾ��");
        f.setLayout(new GridLayout(3, 3));
        //ʹ��forѭ��Ϊ������Ӱ�ť
        for (int i = 0; i < 9; i++) {
            f.add(new Button("��ť" + (i + 1)));

        }
        //���ô��ڵĴ�С���Լ��ɼ�
        f.setSize(200, 200);
        f.setVisible(true);

    }
}
