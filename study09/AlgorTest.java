package cn.legeyung.study09;

/**
 * �ӿڵ�ѧϰ,�Լ����������
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class AlgorTest {
	public static void main(String[] args) {
		Algor al = new Algor();
		ladd ad = al;
		lsub su = al;
		lmul lm = al;
		lumul lu = al;
		System.out.println("����ʹ�ö������������÷�����");
		System.out.println("a+b��ֵ�ǣ�" + al.add(6, 3));
		System.out.println("a-b��ֵ�ǣ�" + al.sub(6, 3));
		System.out.println("a*b��ֵ�ǣ�" + al.mul(6, 3));
		System.out.println("a/b��ֵ�ǣ�" + al.umul(6, 3));
		System.out.println("��������ʹ�ýӿ����õ��÷�����");
		System.out.println("a+b��ֵ�ǣ�" + ad.add(9, 3));
		System.out.println("a-b��ֵ�ǣ�" + su.sub(9, 3));
		System.out.println("a*b��ֵ�ǣ�" + lm.mul(9, 3));
		System.out.println("a/b��ֵ�ǣ�" + lu.umul(9, 3));
	}

}

interface ladd {
	int add(int a, int b);
}

interface lsub {
	int sub(int a, int b);
}

interface lmul {
	int mul(int a, int b);
}

interface lumul {
	int umul(int a, int b);
}

class Algor implements ladd, lsub, lmul, lumul {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int umul(int a, int b) {
		return a / b;
	}

}
