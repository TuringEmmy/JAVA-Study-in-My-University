package cn.legeyung.study06;

/**
 * ��ʼ���������Ĭ�����
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class PeopleConstructor {
	private String name;
	private String sex;
	private int age;

	public PeopleConstructor() {
	}

	public String eat(String food) {
		return "���ڳ�" + food;
	}

	public void tea() {
		System.out.println("���ںȲ�...");
	}

	public static void main(String[] args) {

		PeopleConstructor peoplec = new PeopleConstructor();
		System.out.println("������Ĭ�ϳ�ʼֵ��" + peoplec.name);
		System.out.println("�Ա��Ĭ�ϳ�ʼֵ��" + peoplec.sex);
		System.out.println("�����Ĭ�ϳ�ʼֵ��" + peoplec.age);
	}
}
