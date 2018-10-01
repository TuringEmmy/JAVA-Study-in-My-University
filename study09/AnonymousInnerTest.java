package cn.legeyung.study09;

/**
 * �����ӿڶ��� �����ﵽͬ����Ч��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class AnonymousInnerTest {
	public static void main(String[] args) {
		DustMan dm = new DustMan();
		dm.cleanWithBroom();
		dm.cleanWithDustCollector();
	}

}

class DustMan {
	public void cleanWithBroom() {
		Utility util = new Utility() {
			public void clean() {
				System.out.println("�����������...");
			}
		};
		util.clean();
	}

	public void cleanWithDustCollector() {
		ElectronicUtil util = new ElectronicUtil() {
			public void clean() {
				System.out.println("����ʹ���������������....");
			}
		};
		util.clean();
	}
}

interface Utility {
	public void clean();
}

class ElectronicUtil {
	public void clean() {
		System.out.println("ʹ�õ����豸�������...");
	}

}
