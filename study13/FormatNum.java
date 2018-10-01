package cn.legeyung.study13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class FormatNum {
	public static String forNumber(Double d) { // ���������ָ�ʽ������ǧ��λ��
		return NumberFormat.getNumberInstance().format(d);
	}

	public static String forCurrency(Double d) { // �Ի��ҵ���ʽ�������ָ�ʽ����06 �˴�ʹ����������
		return NumberFormat.getCurrencyInstance(Locale.US).format(d);
	}

	public static String forPercent(Double d) { // ���ٷ�������ʽ��ʽ������
		return NumberFormat.getPercentInstance().format(d);
	}

	public static String forPattern(String p, Double d) { // ����ģʽ��ʽ�����֣�13
															// ����С�����λ����ӵ�λ���ŵ�
		DecimalFormat df = new DecimalFormat();
		df.applyPattern(p);
		return df.format(d);
	}

	public static void main(String[] args) {
		Double d = 666888.0;
		System.out.println("��ʽ����" + d);
		System.out.println("-----------------");
		System.out.println("һ���ʽ����" + forNumber(d));
		System.out.println("���Ҹ�ʽ����" + forCurrency(d));
		System.out.println("�ٷֱȸ�ʽ����" + forPercent(d));
		String p = "0000.0";
		System.out.println("ʹ��ģʽ��" + p + " ��ʽ����" + forPattern(p, d));
		p = "####000000000.00 $";
		System.out.println("ʹ��ģʽ��" + p + " ��ʽ����" + forPattern(p, d));
		d = 367.5566;
		System.out.println("\n��ʽ����" + String.valueOf(d));
		System.out.println("-----------------");
		p = "0.00E0";
		System.out.println("ʹ��ģʽ��" + p + " ��ʽ����" + forPattern(p, d));
		p = "#0.00%";
		System.out.println("ʹ��ģʽ��" + p + " ��ʽ����" + forPattern(p, d));
	}
}
