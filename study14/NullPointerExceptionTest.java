package cn.legeyung.study14;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 *
 */
public class NullPointerExceptionTest {
	public static void main(String[] args) {
		ClassTest ct = null;
		ct.getName();
	}
}

class ClassTest {
	private String name; // ����

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
