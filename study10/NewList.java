package cn.legeyung.study10;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;

/**
 * �б�ѧϰ
 * @author Ӻ���(Lege_Yung)
 *
 */
public class NewList {
    public static void main(String[] args) {
        //������������������
        Frame f = new Frame("����һ���б�ʾ��");
        f.setLayout(new GridLayout(1, 2));
        Label lb = new Label("��ѡ���ұߵ����");
        lb.setAlignment(Label.RIGHT);
        //�����б�
        List list = new List(7, true);
        list.add("2007��");
        list.add("2008��");
        list.add("2009��");
        list.add("2010��");
        //���б���ӵ�������
        f.add(lb);
        f.add(list);
        //���ô��ڿɼ�
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
