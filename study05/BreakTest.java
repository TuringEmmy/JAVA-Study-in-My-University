package cn.legeyung.study05;

/**
 * break�Ĳ��ԣ����㵱ǰ�����Ĳ�ִ��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class BreakTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 6)
				break;
			System.out.println("��ǰִ�е���i=" + i);
		}
	}
}
