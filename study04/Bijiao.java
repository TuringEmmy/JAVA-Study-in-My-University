package cn.legeyung.study04;

/**
 * String.compareTo()���ֵ�˳��Ƚ������ַ����� String.quals()�Ƚϴ��ַ�����ָ���Ķ���
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class Bijiao {
	public static void main(String[] args) {
		String zhagnsan = "Think In Java!";
		String lisi = "Think In Java!";
		String wangwu = "think in java";
		String zhaoliu = "Think in Java";

		if (zhagnsan.equals(lisi))
			System.out.println("���������Ķ���������ͬ");
		else
			System.out.println("���������Ķ������ݲ�ͬ");

		if (lisi.equals(wangwu))
			System.out.println("���ĺ��������������ͬ");
		else
			System.out.println("���ĺ�����������ݲ�ͬ");

		if ((wangwu.compareTo(zhaoliu)) > 0)
			// ��������ַ������ڴ��ַ������򷵻� 0 ֵ��������ֵ�˳����ַ���С���ַ����������򷵻�һ��С�� 0
			// ��ֵ��������ֵ�˳����ַ��������ַ����������򷵻�һ������ 0 ��ֵ��
			System.out.println("�������������������ͬ");
		else
			System.out.println("����������������ݲ�ͬ");
	}
}
