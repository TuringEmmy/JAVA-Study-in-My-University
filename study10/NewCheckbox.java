package cn.legeyung.study10;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

/**
 * ��ѡ��ѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */

public class NewCheckbox {
	public static void main(String[] args) {
		Frame f = new Frame("Checkboxʾ��");
		f.setLayout(new GridLayout(2, 3));
		Label lb = new Label("���˰���");

		Checkbox c1 = new Checkbox("����");
		Checkbox c2 = new Checkbox("����");
		Checkbox c3 = new Checkbox("����");
		Checkbox c4 = new Checkbox("������");
		Checkbox c5 = new Checkbox("��Ӿ");

		f.add(lb);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		f.add(c5);

		f.setSize(500, 150);
		f.setLocation(200, 200);
		f.setVisible(true);

	}
}
