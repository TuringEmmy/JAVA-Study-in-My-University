package cn.legeyung.study02;

/**
 * boolean����
 * ^��λ���
 * @author Ӻ���(Lege_Yung)
 *
 */
public class LogicalOperator {
    public static void main(String[] args) {
        //��������x��y��������ʼֵ
        boolean x = true;
        boolean y = false;
        //�ֱ��ӡ����߼�������
        System.out.println("x&y��ֵ�ǣ�" + (x & y));
        System.out.println("x|y��ֵ�ǣ�" + (x | y));
        System.out.println("!x��ֵ�ǣ�" + !x);
        System.out.println("x&&y��ֵ�ǣ�" + (x && y));
        System.out.println("x||y��ֵ�ǣ�" + (x || y));
        System.out.println("x^y��ֵ�ǣ�" + (x ^ y));
        System.out.println("x^x��ֵ�ǣ�" + (x ^ x));
    }
}

