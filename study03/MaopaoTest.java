package cn.legeyung.study03;

/**
 * ����ð������
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class MaopaoTest {
	public static void main(String[] args) {
		int[] intarray = { 1, 2, 33, 5, 34, 67, 213, 8 };
		System.out.println("����ǰ�����飺");
		for (int i = 0; i < intarray.length; i++)
			System.out.print(intarray[i] + "   ");
		int temp;
		System.out.println();
		
		for (int i = 0; i < intarray.length; i++) {
			for (int j = i; j < intarray.length; j++) {
				if (intarray[j] < intarray[i]) {
					temp = intarray[i];
					intarray[i] = intarray[j];
					intarray[j] = temp;
				}
			}

		}
		System.out.println("����������");
		for (int i = 0; i < intarray.length; i++) {
			System.out.print(intarray[i] + "   ");
		}
	}
}
