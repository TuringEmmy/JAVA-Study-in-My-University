package cn.legeyung.study06;

/**
 * �ֲ�������ȫ�ֱ�����ѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class Variable {
	static int i;
	static private int sum;
	int j;
	final int k = 10;

	public void sum() {
		sum = 0;
		for (j = 1; j < 11; j++) {

			sum = sum + j;
		}
		System.out.println("��1��10�ۼ���ӽ����" + sum);
		System.out.println("����k��ֵ��" + k);
	}

	public static void main(String[] args) {
		sum = 0;
		for (i = 1; i < 11; i++) {

			sum = sum + i;
		}
		System.out.println("��1��10�ۼ���ӽ����" + sum);

		Variable var = new Variable();
		var.sum();
	}
}
