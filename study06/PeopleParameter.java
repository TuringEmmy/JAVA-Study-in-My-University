package cn.legeyung.study06;

/**
 * parameter(����)ѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class PeopleParameter {
	private String name;
	private String sex;
	private int age;

	public PeopleParameter(String jname, String jsex, int jage) {
		name = jname;
		sex = jsex;
		age = jage;
	}

	public String eat(String food) {
		return "���ڳ�" + food;
	}

	public void tea() {
		System.out.println("���ںȲ�...");
	}

	public static void main(String[] args) {
		PeopleParameter people = new PeopleParameter("����", "��", 20);
		System.out.println("������" + people.name);
		System.out.println("�Ա�" + people.sex);
		System.out.println("���䣺" + people.age);
	}
}
