package cn.legeyung.study10;

import java.awt.Frame;
import java.awt.Label;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class NewJLabel {
	public static void main(String[] args) {
		Frame f = new Frame("��ǩ");

		Label label = new Label("����һ����ǩ"); // ��ǩ���ԭ�
		label.setAlignment(Label.CENTER);

		f.add(label);
		f.setSize(200, 200);
		f.setVisible(true);

	}
}
