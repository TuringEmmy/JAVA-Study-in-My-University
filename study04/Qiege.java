package cn.legeyung.study04;

/**
 * String�ķָ�String.split(),������ʽ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class Qiege {
	public static void main(String[] args) {
		String str = "�������ؼҳԷ������";

		String[] st = str.split("��");
		System.out.println("ԭ���ǣ�" + str);

		for (int i = 0; i < st.length; i++) {
			System.out.println("���к�ĵ�" + (i + 1) + "�����ǣ�" + st[i]);
		}
	}
}
