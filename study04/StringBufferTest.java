package cn.legeyung.study04;

/**
 * �̰߳�ȫ�Ŀɱ��ַ�����StringBuffer StringBuffer �ϵ���Ҫ������ append �� insert ����
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		// append()׷�ӵ�������
		sb.append("������");
		sb.append("�ؼң�");
		sb.append("�Է���");

		System.out.println(sb.toString());

		int i = sb.length();
		System.out.println("StringBuffer�ĳ����ǣ�" + i);
	}

}
