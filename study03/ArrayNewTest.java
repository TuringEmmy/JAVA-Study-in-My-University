package cn.legeyung.study03;

/**
 * ����ĸ�ֵ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class ArrayNewTest {
	public static void main(String[] args) {
		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = new int[5];
		array2[0] = 1;
		array2[1] = 2;
		array2[2] = 3;
		array2[3] = 4;
		array2[4] = 5;

		for (int i = 0; i < 5; i++) {
			System.out.println("����array1[" + i + "]��ֵ�ǣ�" + array1[i]);
			System.out.println("����array2[" + i + "]��ֵ�ǣ�" + array2[i]);
		}
	}
}
