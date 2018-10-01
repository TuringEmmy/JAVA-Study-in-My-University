package cn.legeyung.study09;

/**
 * �����ⲿ�����
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class OutObjectTest {
	public static void main(String[] args) {
		Sun sun = new Sun();
		Sun.H2 h2 = sun.getH2();
		h2.burn();
	}

}

class Sun {
	private int temperature = 3600;
	private String type = "star";
	private H2 fuel = null;

	class H2 {
		private String name = "����";

		public String toString() {
			return name;
		}

		public void burn() {
			System.out.println(Sun.this + "����ȼ��" + this);
		}
	}

	public String toString() {
		return "̫��";
	}

	public H2 getFuel() {
		return fuel;
	}

	public void setFuel(H2 fuel) {
		this.fuel = fuel;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public H2 getH2() {
		if (fuel == null) {
			fuel = new H2();
		}
		return fuel;
	}

}
