package cn.legeyung.study14;

/**
 * @author TuringEmmy
 *
 */
public class TryCatchTest {
    public static void main(String[] args) {
        int a, b;
        try {
            a = 0;
            b = 5 / a;
            System.out.println("�������...");
        }
        catch (ArithmeticException e) {
            System.out.println("����ArithmeticException�쳣");
        }
        System.out.println("�������");
    }
}

