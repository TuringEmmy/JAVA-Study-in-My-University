package cn.legeyung.study09;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ������ϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */

public class ImportTest {

	public static void main(String[] args) {

		File file = new File("test.java");

		Date date = new Date();

		System.out.println("��ǰʱ���ǣ�" + date);

		BigDecimal decimal = new BigDecimal(5);

		// BigDecimal ���ɱ�ġ����⾫�ȵ��з���ʮ��������BigDecimal ��ʾ����ֵ�� (unscaledValue ��
		// 10-scale)��
		System.out.println("decimal:" + decimal);
	}

}
