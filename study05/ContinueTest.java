package cn.legeyung.study05;

/**
 * continue���� ���˸о�û����
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class ContinueTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;
			System.out.println("��ǰִ�е���i=" + i);
		}
	}
}
