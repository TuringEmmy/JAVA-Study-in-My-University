package cn.legeyung.study09;

/**
 * �ڲ�����Ե�����
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class InnerTest {
	public static void main(String[] args) {
		Outer out = new Outer(); // ����һ���ⲿ�����
		out.useIner(); // ���ø�����ڲ��ඨ��ķ���
	}
}

class Outer {
	String out_string = "String in Outer";// �����ⲿ��ı���

	void useIner() { // �����ⲿ��ķ���
		Iner in = new Iner(); // ���ⲿ���ж��ڲ���Ķ�����ж���
		in.print(); // �����ڲ���ķ���
	}

	// �����ڲ���

	class Iner {
		void print() { // ���ڲ����ж���ķ���
			System.out.println("Iner.print()");
			// ���ڲ����з�����������ı���
			System.out.println("use\'" + out_string + "\'");
		}
	}
}
