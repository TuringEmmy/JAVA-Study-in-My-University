package cn.legeyung.study14;

/**
 * @author TuringEmmy
 *
 */
public class TryCatchFinallyTest {
    public static void main(String[] args) {
        double a = Math.random();
        try {
            if (a > 0.5) {
                System.out.println(a);
            } else {
                throw new Exception();
            }
        } catch (Exception el) {
            System.out.println("�����������������쳣��" + el);
            try {
                a = 10 / 0;
            } catch (ArithmeticException em) {
                System.out.println("�����ڲ���������쳣��" + em);
            } finally {
                System.out.println("�����ڲ��finally��");
            }
        } finally {
            System.out.println("��������finally��");
        }
    }
}

