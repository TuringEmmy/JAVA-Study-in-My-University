package cn.legeyung.study07;

/**
 * ����Ĳ��ԡ� �̳��Լ��ӿڵ�ѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class SonTest extends FatherTest implements Stepfather {
	public void hitChild() {
		System.out.println("���Ǽ̸�");
	}

	public static void main(String[] args) {
		SonTest son = new SonTest();
		son.pet("��������");
		son.hitChild();
	}
}

class FatherTest {
	public void pet(String str) {
		System.out.println(str);
	}
}

interface Stepfather {
	public void hitChild();
}
