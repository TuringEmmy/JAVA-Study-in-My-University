package cn.legeyung.study02;

/**
 * �������ͱ���������ֵ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class TypeTest {
	public static void main(String[] args) {
		// �����������ͱ���������ֵ
		byte b = 1;
		short s = 2;
		char c = 'c';
		int i = 3;
		long l = 4;
		float f = 5;
		double d = 6.0;
		System.out.println("����b��ֵΪ��" + b);
		System.out.println("����s��ֵΪ��" + s);
		System.out.println("����c��ֵΪ��" + c);
		System.out.println("����i��ֵΪ��" + i);
		System.out.println("����l��ֵΪ��" + l);
		System.out.println("����f��ֵΪ��" + f);
		System.out.println("����d��ֵΪ��" + d);

		// �ֱ𽫸������ͽ���ת��
		s = b;
		i = c;
		i = s;
		l = i;
		f = l;
		d = f;
		d = b;
		d = f + d;
		System.out.println("ת�������b��ֵΪ��" + b);
		System.out.println("ת�������s��ֵΪ��" + s);
		System.out.println("ת�������c��ֵΪ��" + c);
		System.out.println("ת�������i��ֵΪ��" + i);
		System.out.println("ת�������l��ֵΪ��" + l);
		System.out.println("ת�������f��ֵΪ��" + f);
		System.out.println("ת�������d��ֵΪ��" + d);

	}
}
