package cn.legeyung.study06;

/**
 * 
 * variable��ѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class VariablePart {
	public void eat() {
		int i = 12;
		String eat = "�Է�ʱ��";
		String tea = "�����ʱ��";
		if (i > 11 && i < 14) {
			System.out.println("����ʱ����" + i + "�㣬��" + eat);
		} else if (i > 15 && i < 17) {
			System.out.println("����ʱ����" + i + "�㣬��" + tea);
		}

	}

	public void tea() {
		int i = 16;
		String eat = "�Է�ʱ��";
		String tea = "�����ʱ��";
		if (i > 11 && i < 14) {
			System.out.println("����ʱ����" + i + "�㣬��" + eat);
		} else if (i > 15 && i < 17) {
			System.out.println("����ʱ����" + i + "�㣬��" + tea);
		}
	}

	public static void main(String[] args) {
		VariablePart vp = new VariablePart();
		vp.eat();
		vp.tea();
	}
}
