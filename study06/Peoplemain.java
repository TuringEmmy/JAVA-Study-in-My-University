package cn.legeyung.study06;

/**
 * ���캯����ʹ��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class Peoplemain {
	private String name;
	private String sex;
	private int age;

	public String eat(String food) {
		return "���ڳ�" + food;
	}

	public void tea() {
		System.out.println("���ںȲ�...");
	}

	public static void main(String[] args) {
		String str = new Peoplemain().eat("ƻ��");
		System.out.println(str);
		new Peoplemain().tea();
	}
}
