package cn.legeyung.study06;

/**
 * equals()ֻҪ��������ͬ���� ==���ǿ���ַ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class Equal {
	public static void main(String[] args) {
		String stra = new String("���");
		String strb = new String("���");
		String strc = stra;

		boolean a = stra == strb;
		boolean b = stra == strc;

		boolean c = stra.equals(strb);
		boolean d = stra.equals(strc);

		System.out.println("ʹ�á�==�����бȽϽ����");
		System.out.println("stra��strb���бȽϣ�" + a + "\n" + "stra��strc���бȽϣ�" + b
				+ "\n");
		System.out.println("ʹ�á�equal���������бȽϽ����");
		System.out.println("stra��strb���бȽϣ�" + c + "\n" + "stra��strc���бȽϣ�" + d
				+ "\n");
	}
}
