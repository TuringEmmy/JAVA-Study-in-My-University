package cn.legeyung.study07;

/**
 * tostring��ʹ�� �вκ������޲κ�����ʹ��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class ToStringTest {
	public static void main(String[] args) {
		ToString ts = new ToString();
		ts.name = "����";
		ts.age = 22;
		ts.sex = "��";
		System.out.println(ts);
	}
}

class ToString {
	String name;
	int age;
	String sex;

	public ToString() {
	}

	public ToString(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String toString() {
		return "����:" + name + "\n����:" + age + "\n�Ա�:" + sex;
	}
}
