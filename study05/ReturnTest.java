package cn.legeyung.study05;

/**
 * return��ѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class ReturnTest {
	public boolean var(int i) {
		if (i > 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		if (rt.var(-2)) {
			System.out.println("�����ֵΪ����..");
		} else {
			System.out.println("�����ֵΪ����..");
		}
	}
}
