package cn.legeyung.study10;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;

/**
 * �ı��������񲼾���
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class NewTextArea {
	public static void main(String[] args) {
		Frame f = new Frame("����һ�������ı���ʾ��");
		f.setLayout(new GridLayout(2,1));
		Label lb = new Label("�������ı������Ի���");
		lb.setAlignment(Label.CENTER);
		TextArea tf = new TextArea();
		tf.setBackground(Color.gray);

		f.add(lb);
		f.add(tf);
		f.setSize(200, 160);
		f.setVisible(true);
	}
}
