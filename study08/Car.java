package cn.legeyung.study08;

/**
 * @author TuringEmmy
 *
 */
public class Car extends Auto {
    public String name = "a nice car";

    public void engine() {
        System.out.println("a nice engine");
    }

    public static void run() {
        System.out.println("fast");
    }

    public void fun() {
        super.engine();
    }

    public static void main(String[] args) {
        Auto auto = new Car();
        System.out.println(auto.name); // ������
        auto.price(); // ����final����
        auto.run();  // ���ྲ̬����
        auto.fun(); // super�ؼ���
    }
}

