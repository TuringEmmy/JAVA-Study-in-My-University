package cn.legeyung.study14;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 *
 */
public class MyException extends Exception { // �����Լ����쳣��
	// ���캯��

	MyException() {
	}
	// �������Ĺ��캯��

	MyException(String msg) {
		super(msg); // ���ø���ķ���
	}
}
