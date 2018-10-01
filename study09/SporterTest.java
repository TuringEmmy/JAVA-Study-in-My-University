package cn.legeyung.study09;

/**
 * ���˸о�addVataminc����û�й�ϵ
 * @author Ӻ���(Lege_Yung)
 *
 */
public class SporterTest {
	public void drink(Beverages drink) {
		System.out.println("�˶�Ա������" + drink);
	}

	public static void main(String[] args) {
		SporterTest sp = new SporterTest();
		sp.drink(new Beverages("��֭") {
			public void addVataminc() {
				System.out.println("���ά����C");
			}
		});

		sp.drink(new Beverages("����") {
			public void addVataminc() {
				System.out.println("��Ӷ�����̼");
			}
		});

		sp.drink(new Beverages("ѩ��") {
			public void addVataminc() {
				System.out.println("��Ӷ�����̼");
			}
		});

		sp.drink(new Beverages("�Ҵ�") {
			public void addVataminc() {
				System.out.println("���ɫ��");
			}
		});
		sp.drink(new Beverages("�̲�") {
			public void addVataminc() {
				System.out.println("���ɫ��");
			}
		});
	}

}

class Beverages {
	private String juiceName;

	public Beverages(String name) {
		this.juiceName = name;
	}

	public String toString() {
		return juiceName;
	}
}
