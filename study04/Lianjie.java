package cn.legeyung.study04;

/**
 * String.concat()��ָ���ַ����������ַ����Ľ�β
 * @author Ӻ���(Lege_Yung)
 *
 */
public class Lianjie {
    public static void main(String[] args) {
        String str = "Hello ";
        String s = "World ";
        String b = "!";

        String a = str.concat(s);
        String c = str.concat(str).concat(b);

        System.out.println(a);
        System.out.println(c);
    }
}

