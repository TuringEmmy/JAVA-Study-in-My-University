package cn.legeyung.study14;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 *
 */
public class MoreCatchTest {
	public static void main(String[] args) {
		int[] a = new int[3];
		try {
			a[3] = 10;
			System.out.println("������..");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����ArrayIndexOutOfBoundsException�쳣");
		} catch (ArithmeticException e1) {
			System.out.println("����ArithmeticException�쳣");
		} catch (Exception e2) {
			System.out.println("����Exception�쳣");
		}
		System.out.println("�������");
	}

}
