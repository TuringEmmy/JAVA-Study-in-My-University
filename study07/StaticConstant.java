package cn.legeyung.study07;

/**
 * ��̬������ʹ��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class StaticConstant {
	public static void main(String[] args) {
		StaticContantTest sct = new StaticContantTest();
		System.out.println(sct.eat());
	}
}

class StaticContantTest {
	static final String str = "ȥ�Է�...";

	static String eat() {
		return str;
	}
}
