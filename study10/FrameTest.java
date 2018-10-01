package cn.legeyung.study10;

import java.awt.*;

/**
 * ����Frameѧϰ������Ļ����ʾһ�����壬��С��������һ��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class FrameTest {
	public static void main(String[] args) {
		Frame frame = new NewFrame(); // ����һ���������
		frame.setVisible(true); // ��ʾ����
	}
}

class NewFrame extends Frame // �̳���JFrame��
{
	NewFrame() // ���캯��
	{
		setTitle("����һ������Ļ���м�λ����ʾ�Ĵ���"); // ���ô������
		Toolkit tk = Toolkit.getDefaultToolkit(); // ȡ�ù�����
		Dimension screenSize = tk.getScreenSize(); // ȡ����ʾ���ߴ�
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth / 2, screenHeight / 2); // ���ô����С
		setLocation(screenWidth / 4, screenHeight / 4); // ���ô���λ��
		this.repaint(); // �ػ洰��
	}
}
