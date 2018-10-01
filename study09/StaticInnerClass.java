package cn.legeyung.study09;

/**
 * ��̬�ڲ���
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class StaticInnerClass {
	public static void main(String[] args) {
		Painter p = new Painter();
		p.setName("����");
		p.print();
	}
}

class Painter {
	private Pen pen = new Pen();
	private String name = "";

	static class Pen {
		private String lead = "Ǧ��о";
		public void print() {
			System.out.println("ʹ��Ǧ��..");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void print() {
		pen.print();
	}
}
