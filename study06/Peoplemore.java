package cn.legeyung.study06;

/**
 * һ���������ж����������
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class Peoplemore {
	private String name;
	private String sex;
	private int age;

	public Peoplemore(String nname, String nsex, int nage) {
		name = nname;
		age = nage;
		sex = nsex;
	}

	public Peoplemore(String jname, int jage) {
		name = jname;
		age = jage;
	}

	public static void main(String[] args) {
		Peoplemore peo = new Peoplemore("����", "��", 20);
		Peoplemore lisi = new Peoplemore("����", 25);
		System.out.println(peo.name + "����Ϣ��");
		System.out.println("������" + peo.name);
		System.out.println("�Ա�" + peo.sex);
		System.out.println("����:" + peo.age);
		System.out.println(lisi.name + "����Ϣ");
		System.out.println("������" + lisi.name);
		System.out.println("���䣺" + lisi.age);
	}
}
