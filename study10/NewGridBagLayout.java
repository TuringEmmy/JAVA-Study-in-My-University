package cn.legeyung.study10;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 * ��Ƭ���� GridBagConstraints ��ָ��ʹ�� GridBagLayout �಼�õ������Լ��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class NewGridBagLayout {
	public static void main(String[] args) {
		// �����������������ò��ֹ�����
		Frame f = new Frame("����GridBagLayoutʾ��");
		f.setLayout(new GridBagLayout());
		GridBagConstraints gbcs = new GridBagConstraints();
		// ���ú���������������꣬�����밴ť
		gbcs.gridx = 0;// gridxָ�������������ʾ����ʼ�ߵĵ�Ԫ�������еĵ�һ����Ԫ��Ϊ gridx=0
		gbcs.gridy = 0;// gridyָ��λ�������ʾ����Ķ����ĵ�Ԫ���������ϱߵĵ�Ԫ��Ϊ gridy=0��
		f.add(new Button("��ťһ"), gbcs);
		// ���ú���������������꣬�����밴ť
		gbcs.gridx = 1;
		gbcs.gridy = 0;
		f.add(new Button("��ť��"), gbcs);
		// ���ú���������������꣬�����밴ť
		gbcs.gridx = 0;
		gbcs.gridy = 1;
		f.add(new Button("��ť��"), gbcs);
		// ���ú���������������꣬�����밴ť
		gbcs.gridx = 1;
		gbcs.gridy = 1;
		f.add(new Button("��ť��"), gbcs);

		f.setSize(200, 200);
		f.setVisible(true);

	}
}
