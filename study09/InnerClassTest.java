package cn.legeyung.study09;

/**
 * �ڲ����ѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class InnerClassTest {
	class Clothes {
		private String material; // ���ò���
		private int size; // ���ô�С
		private String color; // ������ɫ

		public String getColor() { // ����set/get����
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}
	}

}

class Coat extends InnerClassTest.Clothes {
	public Coat(InnerClassTest o) {
		o.super(); // ��ʼ����Χ�������
	}
}
