package cn.legeyung.study08;

/**
 * @author TuringEmmy
 *
 */
public class ClassTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "����";
        stu.age = 20;
        stu.print();
        stu.print("����", 21);
        stu.print("����", 22, 10);
        stu.print("����", 22, 11, 80);

    }
}

class Student {
    String name;
    int age;

    void print() {
        System.out.println("������" + name + "���䣺" + age);
    }

    void print(String name1, int age1) {
        System.out.println("������" + name1 + "���䣺" + age1);
    }

    void print(String name2, int age2, int id) {
        System.out.println("������" + name2 + "���䣺" + age2 + "ѧ���ǣ�" + id);
    }

    void print(String name3, int age3, int id3, double a) {
        System.out.println("������" + name3 + "���䣺" + age3 + "ѧ���ǣ�" + id3 + "�ɼ��ǣ�" + a);
    }
}

