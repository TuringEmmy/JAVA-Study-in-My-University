package cn.legeyung.study06;

/**
 * this���ٴ�ѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class ThisTest {
	private String eat = "���ڳԷ�...";
	private String tea = "���ںȲ�...";
	private String work = "���ڹ���....";

	public void zhagnsna() {
		System.out.println("ʹ��this�ؼ��������ó�Ա���������������Ϊ��");
		System.out.println("����" + this.eat);
		System.out.println("����" + this.tea);
		System.out.println("����" + this.work);
	}

	public void lisi() {
		System.out.println("��ʹ��this�ؼ��������ó�Ա���������������Ϊ��");
		System.out.println("����" + eat);
		System.out.println("����" + tea);
		System.out.println("����" + work);
	}

	public static void main(String[] args) {
		new ThisTest().zhagnsna();
		new ThisTest().lisi();
	}
}
