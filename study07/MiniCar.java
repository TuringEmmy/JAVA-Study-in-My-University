package cn.legeyung.study07;

/**
 * set��get������ʹ��
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class MiniCar extends Car {
	public static void main(String[] args) {
		MiniCar car = new MiniCar();
		System.out.println("�����г�����ɫ�ǣ�" + car.color);
		car.setColor("blue");
		System.out.println("�����г�����ɫ��: " + car.color);
	}
}

class Car {
	String color = "red";

	public void setColor(String c) {
		this.color = c;
	}
}
