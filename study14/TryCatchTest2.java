package cn.legeyung.study14;

/**
 * @author TuringEmmy
 *
 */
public class TryCatchTest2 {
    public static void main(String[] args) {
        int a, b;
        try {
            a = 0;
            b = 5 / a;
            System.out.println("�������...");
        }
        catch (ArithmeticException e) {
            System.out.println("�������쳣�ǣ�" + e);
        }
        System.out.println("�������");
    }
}

