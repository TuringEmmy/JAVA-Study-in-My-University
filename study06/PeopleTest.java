package cn.legeyung.study06;

/**
 * ����People��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class PeopleTest {
	public static void main(String[] args) {
		People people = new People();
		System.out.println("������Ϣ�����");
		System.out.println("������" + people.name);
		System.out.println("�Ա�" + people.sex);
		System.out.println("���䣺" + people.age);
		System.out.println("סַ��" + people.address);
		System.out.println(people.name + "�ڸ��");
		System.out.println(people.name + people.eat());
	}
}
