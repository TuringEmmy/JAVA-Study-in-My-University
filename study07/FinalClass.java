package cn.legeyung.study07;

/**
 * final���ѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class FinalClass {
	public static void main(String[] args) {
		FinalClassTest fct = new FinalClassTest();
		fct.eat = "��ȥ�Է���";
		fct.str = "ʮһ���";
		fct.print();
		fct.eat();
	}
}

final class FinalClassTest {
	String str;
	String eat;

	void print() {
		System.out.println("����ʱ����" + str);
	}

	void eat() {
		System.out.println(eat);
	}
}
