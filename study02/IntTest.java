package cn.legeyung.study02;

/**
 * intѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class IntTest {
	public static void main(String[] args) {
		byte m; // byte���(-128,127) 2^7-1
		short x; // short��Χ(-32768,32767) 2^15-1
		int i; // int ��Χ(-2147483648,2147483647) 2^31-1
		long l; // long��Χ()

		// Ϊ�����ͱ�����ֵ
		m = 127;
		x = -3276;
		i = 2147483647;
		l = 92234;

		// ��ӡ��������ͱ�����ֵ
		System.out.println("byte ���ͱ���m��ֵΪ��" + m);
		System.out.println("short���ͱ���x��ֵΪ��" + x);
		System.out.println("int���ͱ���i��ֵΪ��" + i);
		System.out.println("long ���ͱ���l��ֵΪ��" + l);
	}
}
