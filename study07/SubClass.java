package cn.legeyung.study07;

/**
 * �������ʹ�� ��������г�����Ķ������򸲸Ǹ���ķ���
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class SubClass extends AbstractClass {
	public void speak() {
		System.out.println("������ȥ�Է�...");
	}

	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.speak();
		sc.eat();
	}
}

abstract class AbstractClass {
	public void eat() {
		System.out.println("����һ��ȥ�Է�...");
	}

	public abstract void speak();
}
