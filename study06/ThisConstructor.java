package cn.legeyung.study06;

/**
 * this��ʹ��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class ThisConstructor {
	String name;

	public ThisConstructor(String onename) {
		name = onename;
		System.out.println("������" + name);
	}

	public ThisConstructor() {
		this("����");
	}

	public static void main(String[] args) {
		new ThisConstructor();
	}
}
