package cn.legeyung.study04;

/**
 * String���滻 String.replace() String.replaceAll() String.replaceFirst()
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class Xiugai {
	public static void main(String[] args) {
		String s1 = new String("��һ������");
		String str = s1.replace('һ', '��');
		System.out.println(str);

		String s2 = new String("�ڶ�������");
		String str2 = s2.replaceAll("��", "��");
		System.out.println(str2);

		String s3 = new String("����������");
		String str3 = s3.replaceFirst("��", "��");
		System.out.println(str3);
	}
}
