package cn.legeyung.study07;

/**
 * �õ���MiniCar�ļ������Car��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class MiniCar2 extends Car {
	private int maxspeed;

	public static void main(String[] args) {
		MiniCar2 car = new MiniCar2();
		System.out.println("�����г�����ɫ�ǣ�" + car.color);
		car.setColor("blue");
		System.out.println("�����г�����ɫ�ǣ�" + car.color);

		System.out.print("С����������ٶ��ǣ�");
		car.setMaxspeed(180);
		System.out.println(car.maxspeed);

	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
}
