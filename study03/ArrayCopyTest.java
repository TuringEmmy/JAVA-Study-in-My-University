package cn.legeyung.study03;

/**
 * 数组的复制
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class ArrayCopyTest {
	public static void main(String[] args) {
		// 创建数组
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		System.out.println("两个数组的初始值为：");
		for (int i = 0; i < array1.length; i++)
			System.out.println("array1[" + i + "]=" + array1[i]);
		for (int i = 0; i < array2.length; i++)
			System.out.println("array2[" + i + "]=" + array1[i]);
		// 将array2赋值给array1
		array1 = array2;

		System.out.println("在执行数组的复制后，两个数组的值：");
		// 打印输出复制后的值
		for (int i = 0; i < array1.length; i++)
			System.out.println("array1[" + i + "]=" + array1[i]);
		for (int i = 0; i < array2.length; i++)
			System.out.println("array2[" + i + "]=" + array1[i]);

		System.out.println("将数组array2的一个元素改变");
		array2[2] = 8;
		System.out.println("array2[2]=" + array1[2]);
		System.out.println("array1[2]=" + array1[2]);
	}
}
