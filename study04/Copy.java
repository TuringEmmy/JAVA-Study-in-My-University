package cn.legeyung.study04;

/**
 * ����Ĳ��ָ���
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class Copy {
	public static void main(String[] args) {
		String str = "HelloWorld!";

		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++)
			ch[i] = str.charAt(i);

		String s = String.copyValueOf(ch);
		String st = String.copyValueOf(ch, 0, 5);

		System.out.println(s);
		System.out.println(st);
	}
}
