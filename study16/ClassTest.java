package org.gaozou.book.javaabc.examples.ch16;

/**
 * @author TuringEmmy
 *
 */
public class ClassTest {
    public static void main(String[] args) {
        try {
            //����ָ������
            Class cs = Class.forName("cn.com.ch16.Son");
            Son myson = (Son) cs.newInstance();
            //���ô�������ķ���
            System.out.println("���ô�������ķ���:");
            myson.methodSonProtected();
            myson.methodSonPublic();
            myson.methodFather();
            //���������ϸ��Ϣ
            System.out.println("���������Ϣ:");
            System.out.println(cs.getName() + "�Լ�������" +
                    cs.getDeclaredFields().length + "����Ա����");
            System.out.println(cs.getName() + "����⹫���ķ�����" +
                    cs.getMethods().length + "��");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Father {
    //����Ĺ�����Ա����
    public int memberFather;
    //�����еĹ�������

    public void methodFather() {
        System.out.println("���ǴӸ����м̳ж����ķ���methodFather");
    }
}

class Son extends Father {
    //����Ķ����Ա����
    public int memberSonPublic;
    //�����˽�г�Ա����
    private int memberSonPrivate;
    //����Ĺ�������

    public void methodSonPublic() {
        System.out.println("���������Լ��ķ���methodSonPublic");
    }

    public void methodSonProtected() {
        System.out.println("���������Լ��ķ���methodSonProtected");
    }
}
