package cn.legeyung.study02;

/**
 * λ���㼰���ʽ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class PositionTest {
	public static void main(String[] args) {
		// ʹ��λ����>>
		System.out.println("00001111>>2 �������ǣ�" + (00001111 >> 2));
		// ʹ��λ����>>
		System.out.println("11000011>>2 �������ǣ�" + (11000011 >> 2));
		// ʹ��λ����<<
		System.out.println("00001111<<2 �������ǣ�" + (00001111 << 2));
		// ʹ��λ����<<
		System.out.println("11000011<<2 �������ǣ�" + (11000011 << 2));
		// ʹ��λ����&
		System.out.println("00001111 & 00001111 �������ǣ�" + (00001111 & 0000111));
		// ʹ��λ����|
		System.out
				.println("00001111 | 00001111 �������ǣ�" + (00001111 | 00001111));
		// ʹ��λ����^
		System.out
				.println("00001111 ^ 00001111 �������ǣ�" + (00001111 ^ 00001111));
		// ʹ��λ����~
		System.out.println("~ 00001111 �������ǣ�" + (~00001111));
	}
}
