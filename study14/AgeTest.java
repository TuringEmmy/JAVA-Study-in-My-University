package cn.legeyung.study14;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 *
 */
public class AgeTest {
    //�ڲ�������ʹ���Լ�������쳣��

    public static void main(String args[]) {
        //���õķ������ܻ��׳��쳣
        try {
            String name = "����";                    //������������
            String name2 = "����";
            String level = null;
            level = AgeLevel(20);
            System.out.println(name + "�ǣ�" + level);
            level = AgeLevel(140);
            System.out.println(name2 + "�ǣ�" + level);
        }
        catch (IllegalAgeException e) {
            e.printStackTrace();
        }
    }
    //����ķ������ܻ�����쳣

    static String AgeLevel(int age) throws IllegalAgeException {
        if (age >= 10 && age < 18)
            return "С��";
        else if (age >= 18 && age < 30)
            return "С����";
        else if (age >= 30 && age < 40)
            return "������";
        else if (age < 60 && age >= 100)
            return "������";
        else
            //�׳��쳣
            throw new IllegalAgeException("�Ƿ�������");
    }
}

class IllegalAgeException extends Exception {//�Զ����쳣�̳�Exception��
    //�����쳣�Ĺ��췽��

    IllegalAgeException() {
    }
    //�����쳣���в����Ĺ��췽��

    IllegalAgeException(String msg) {
        super(msg);                        //���ø����еĹ��췽��
    }
}

