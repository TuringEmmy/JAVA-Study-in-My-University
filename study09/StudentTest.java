package cn.legeyung.study09;

/**
 * ���Խӿڵ�����
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class StudentTest {
	public static void main(String[] args) {
		Student1 stu = new Student1();
		stu.Learning();
		stu.eat();
		stu.sleep();
	}
}

class Student1 implements Student {

	public void Learning() {
		// TODO Auto-generated method stub
		System.out.println("ѧ������ѧϰ..");
	}

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ѧ�����ڳԷ�...");
	}

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("ѧ������˯��...");
	}
}
