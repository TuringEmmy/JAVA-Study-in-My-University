package cn.legeyung.study03;

/**
 * ����ĸ���
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class ArrayCopyTest {
	public static void main(String[] args) {
		// ��������
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		System.out.println("��������ĳ�ʼֵΪ��");
		for (int i = 0; i < array1.length; i++)
			System.out.println("array1[" + i + "]=" + array1[i]);
		for (int i = 0; i < array2.length; i++)
			System.out.println("array2[" + i + "]=" + array1[i]);
		// ��array2��ֵ��array1
		array1 = array2;

		System.out.println("��ִ������ĸ��ƺ����������ֵ��");
		// ��ӡ������ƺ��ֵ
		for (int i = 0; i < array1.length; i++)
			System.out.println("array1[" + i + "]=" + array1[i]);
		for (int i = 0; i < array2.length; i++)
			System.out.println("array2[" + i + "]=" + array1[i]);

		System.out.println("������array2��һ��Ԫ�ظı�");
		array2[2] = 8;
		System.out.println("array2[2]=" + array1[2]);
		System.out.println("array1[2]=" + array1[2]);
	}
}
