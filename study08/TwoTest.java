package cn.legeyung.study08;

/**
 * @author TuringEmmy
 *
 */
public class TwoTest {
    public static void main(String[] args) {

        TestTwo tt = new TestTwo();
        tt.a = 5;
        tt.b = 6;
        tt.sub();
        tt.add();
        tt.sub(5);

    }

}

class Test {
    int a;
    int b;

    int add() {
        System.out.println("a��b��ֵ�ǣ�" + a + b);
        return a + b;
    }

    int sub() {
        System.out.println("a��b��ֵ�ǣ�" + (a - b));
        return a - b;
    }
}

class TestTwo extends Test {
    int add() {
        System.out.println("a��ֵ�ǣ�" + a);
        return a;
    }

    int sub() {
        System.out.println("b��ֵ�ǣ�" + b);
        return b;
    }

    long sub(long a) {
        System.out.println("a��ֵ�ǣ�" + (a));
        return a;
    }

}

