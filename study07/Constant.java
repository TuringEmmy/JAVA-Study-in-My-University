package cn.legeyung.study07;

/**
 * (Constant)������ѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class Constant {
	public static void main(String[] args) {
		ConstantTest ct = new ConstantTest();
		System.out.println("a��ֵ�ǣ�" + ct.print());

	}
}

class ConstantTest {
	int print() {
		final int a = 10;
		return a;
	}
}
