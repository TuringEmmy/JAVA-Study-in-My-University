package cn.legeyung.study02;

/**
 * 各种类型变量并赋初值
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class TypeTest {
	public static void main(String[] args) {
		// 声明各种类型变量并赋初值
		byte b = 1;
		short s = 2;
		char c = 'c';
		int i = 3;
		long l = 4;
		float f = 5;
		double d = 6.0;
		System.out.println("变量b的值为：" + b);
		System.out.println("变量s的值为：" + s);
		System.out.println("变量c的值为：" + c);
		System.out.println("变量i的值为：" + i);
		System.out.println("变量l的值为：" + l);
		System.out.println("变量f的值为：" + f);
		System.out.println("变量d的值为：" + d);

		// 分别将各个类型进行转换
		s = b;
		i = c;
		i = s;
		l = i;
		f = l;
		d = f;
		d = b;
		d = f + d;
		System.out.println("转换后变量b的值为：" + b);
		System.out.println("转换后变量s的值为：" + s);
		System.out.println("转换后变量c的值为：" + c);
		System.out.println("转换后变量i的值为：" + i);
		System.out.println("转换后变量l的值为：" + l);
		System.out.println("转换后变量f的值为：" + f);
		System.out.println("转换后变量d的值为：" + d);

	}
}
