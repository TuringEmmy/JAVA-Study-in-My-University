package cn.legeyung.study14;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 *
 */
public class TestMyException {
	public static void main(String args[]) {
		MyException mec = new MyException("�������Զ�����쳣��"); // �����Լ����쳣�����
		System.out.println(mec.getMessage()); // ����getMessage����
		System.out.println(mec.toString());
	}
}
