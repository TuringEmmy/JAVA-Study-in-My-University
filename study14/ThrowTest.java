package cn.legeyung.study14;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 *
 */
public class ThrowTest {
	public void throwException() throws Exception {
		String s = null;
		if (s == null) {
			throw new Exception("s��ֵΪnull");// sֵΪnullʱ���׳��쳣
		}
	}

	public static void main(String[] args) {
		ThrowTest tt = new ThrowTest();
		try {
			tt.throwException(); // ����throwException����
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
