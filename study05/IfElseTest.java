package cn.legeyung.study05;

/**
 * else if ��ʹ��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class IfElseTest {
	public static void main(String[] args) {
		int i = 100;
		if (i > 90) {
			System.out.println("�����ĳɼ��ǣ�" + i + "\n" + "�����ǣ��ǳ����㣡");
		} else if (i > 80) {
			System.out.println("�����ĳɼ��ǣ�" + i + "\n" + "�����ǣ����㣡");
		} else if (i > 70) {
			System.out.println("�����ĳɼ��ǣ�" + i + "\n" + "�����ǣ����ã�");
		} else if (i > 60) {
			System.out.println("�����ĳɼ��ǣ�" + i + "\n" + "�����ǣ�����");
		} else {
			System.out.println("�����ĳɼ��ǣ�" + i + "\n" + "�����ǣ������񣬸�Ŭ���ˣ���");
		}
	}
}
