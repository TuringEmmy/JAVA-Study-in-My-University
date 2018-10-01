package cn.legeyung.study14;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 *
 */
public class ClassCastExceptionTest {
	public static void main(String[] args) {
		Book book = new NovelBook();
		Object o = book;
		String s = (String) o;
		System.out.println(s);
	}

}

class Book {
	private String title;
	private String content;
	private String author;
}

class NovelBook extends Book {
	private String type = "����";

	public String toString() {
		return "���⣺" + type;
	}
}
