package cn.legeyung.study02;


/**
 * 
 * @author Ӻ���(Lege_Yung)
 *
 */
public class IDOperatorTest {
    public static void main(String[] args) {
        //�����ĸ���������ʹ�õݼ�
        int a = 1;
        int b = 1;
        int c = a++;
        int d = b++;
        //������ֱ��ӡ���
        System.out.println("a��ֵ�ǣ�" + a);
        System.out.println("b��ֵ�ǣ�" + b);
        System.out.println("c��ֵ�ǣ�" + c);
        System.out.println("d��ֵ�ǣ�" + d + "\n");
        //�����ĸ���������ʹ�õݼ�
        int e = 5;
        int f = 5;
        int g = e--;
        int h = f--;
        //������ֱ��ӡ���
        System.out.println("e��ֵ�ǣ�" + e);
        System.out.println("f��ֵ�ǣ�" + f);
        System.out.println("g��ֵ�ǣ�" + g);
        System.out.println("h��ֵ�ǣ�" + h);

    }
}
