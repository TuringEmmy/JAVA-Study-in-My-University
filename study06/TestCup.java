package cn.legeyung.study06;

/**
 * ����CupTest�����
 * @author Ӻ���(Lege_Yung)
 *
 */
public class TestCup {
    public static void main(String[] args) {
        CupTest ct = new CupTest();
        ct.high = 15;
        ct.color = "��ɫ";
        ct.price = 10.0;
        System.out.println("һ���۸�Ϊ" + ct.price +
                "Ԫ����Ϊ" + ct.high + "���׵�"
                + ct.color + "����");
        ct.water();
    }
}
