package cn.legeyung.study08;

/**
 * @author TuringEmmy
 *
 */
public class SchoolTest {

    public static void main(String[] args) {
        School1 s1 = new School1("�廪����", 100080, 1000, "������");
        s1.print();
    }
}

class School {
    String sname;
    int sid;
    int snumber;

    public School(String name, int id, int number) {
        sname = name;
        sid = id;
        snumber = number;
    }

    void print() {
        System.out.println("ѧУ���ǣ�" + sname + "������ǣ�" + sid + "������Ϊ��24	" + snumber);
    }

}

class School1 extends School {
    String sadder;

    public School1(String name, int sid, int snumber, String adder) {
        super(name, sid, snumber);
        sadder = adder;

    }

    void print() {
        System.out.println("ѧУ���ǣ�" + sname + "������ǣ�" + sid + "������Ϊ��" + snumber + "����ַ�ǣ�" + sadder);
    }
}

