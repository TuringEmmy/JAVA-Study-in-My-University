package cn.legeyung.study07;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 *
 */
public class FinalMethod {
    public static void main(String[] args) {
        FinalTest ft = new FinalTest();
        ft.a = 50;
        ft.print();
    }
}

class FinalTest {
    int a;

    final void print() {
        System.out.println("a��ֵ�ǣ�" + a);
    }
}

