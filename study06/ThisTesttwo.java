package cn.legeyung.study06;

/**
 * this������ѧϰ��ע�������ʹ��ԭ��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class ThisTesttwo {
	String eat = "�Է�ʱ��";
	String tea = "�����ʱ��";
	int i = 16;

	public void eat(int i) {
		if (i > 11 && i < 14) {
			System.out.println("����ʱ����" + i + "�㣬��" + eat);
		} else if (i > 15 && i < 17) {
			System.out.println("����ʱ����" + i + "�㣬��" + tea);
		}

	}

	public void tea(int i) {

		if (this.i > 11 && this.i < 14) {
			System.out.println("����ʱ����" + this.i + "�㣬��" + eat);
		} else if (this.i > 15 && this.i < 17) {
			System.out.println("����ʱ����" + this.i + "�㣬��" + tea);
		}
	}

	public static void main(String[] args) {
		ThisTesttwo vp = new ThisTesttwo();
		vp.eat(12);
		vp.tea(12);
	}
}
