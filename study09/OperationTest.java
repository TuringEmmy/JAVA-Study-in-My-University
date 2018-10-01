package cn.legeyung.study09;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class OperationTest {
	public static void main(String[] args) {
		OTest ot = new OTest();
		System.out.println("a+b��ֵ�ǣ�" + ot.add(15, 3));
		System.out.println("a-b��ֵ�ǣ�" + ot.sub(15, 3));
		System.out.println("a*b��ֵ�ǣ�" + ot.mul(15, 3));
		System.out.println("a/b��ֵ�ǣ�" + ot.umul(15, 3));
	}

}

interface Oadd {
	int add(int a, int b);
}

interface Osub {
	int sub(int a, int b);
}

interface Omul {
	int mul(int a, int b);
}

interface Oumul {
	int umul(int a, int b);
}

class OTest implements Oadd, Osub, Omul, Oumul {

	public int add(int a, int b) {
		// add�����ľ���ʵ��
		return a + b;
	}

	public int sub(int a, int b) {
		// sub�����ľ���ʵ��
		return a - b;
	}

	public int mul(int a, int b) {
		// mul�����ľ���ʵ��
		return a * b;
	}

	public int umul(int a, int b) {
		// umul�����ľ���ʵ��
		return a / b;
	}

}
