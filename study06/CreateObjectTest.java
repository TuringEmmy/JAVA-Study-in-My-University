package cn.legeyung.study06;

/**
 * �������� ���캯��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class CreateObjectTest {
	public static void main(String[] args) {
		Cup cup = new Cup();
		System.out.println("�Ա���û��Ҫ��");
		Cup cupch = new Cup("��ɫ", 15);
		System.out.println("һ����Ϊ15���׵ĺ�ɫ����");
		Cup cupph = new Cup(10.0, 15);
		System.out.println("һ����Ϊ15���ף��۸�Ϊ10Ԫ�ı���");
		Cup cuppc = new Cup(10.0, "��ɫ");
		System.out.println("һ��10Ԫ�ĺ�ɫ����");
		Cup cuppch = new Cup(10.0, "��ɫ", 15);
		System.out.println("һ���۸�Ϊ10Ԫ��Ϊ15���׵ĺ�ɫ����");
	}

}

class Cup {
	private int high;
	private String color;
	private double price;

	public Cup() {
	}

	public Cup(String color, int high) {
		this.color = color;
		this.high = high;
	}

	public Cup(double price, int high) {
		this.price = price;
		this.high = high;

	}

	public Cup(double price, String color) {
		this.price = price;
		this.color = color;
	}

	public Cup(double price, String color, int high) {
		this.price = price;
		this.color = color;
		this.high = high;
	}
}
