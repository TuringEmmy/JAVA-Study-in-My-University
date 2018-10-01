package org.gaozou.book.javaabc.examples.ch21;

/**
 * @author TuringEmmy
 *
 */
public class MyValueTest {
    public static void main(String[] args) {
        //�����Զ���ķ������Ͷ��󣬲����ƶ��������ͱ���
        MyValue<String, Integer> mv1 = new MyValue<String, Integer>();
        //����set�����Գ�Ա������������
        mv1.setValue("�ò���Ϊ�ַ�������", new Integer(100));
        //���ص�һ����Ա������ֵ
        String str1 = mv1.getValue1();
        //���صڶ�����Ա������ֵ
        Integer int1 = mv1.getValue2();
        //��ӡ���
        System.out.println("��һ�����������ֵΪ��" + str1 + "\n�ڶ���ֵΪ��" + int1 + "��\n");
        //������һ���Զ��巺�����Ͷ��󣬲����ƶ��������ͱ���
        MyValue<Integer, String> mv2 = new MyValue<Integer, String>();
        //����set�����Գ�Ա������������
        mv2.setValue(new Integer(100), "�ò���Ϊ�ַ�������");
        //���ص�һ����Ա������ֵ
        String str2 = mv2.getValue2();
        //���صڶ�����Ա������ֵ
        Integer int2 = mv2.getValue1();
        //��ӡ���
        System.out.println("��һ�����������ֵΪ��" + int2 + "\n�ڶ���ֵΪ��" + str2 + "��");
    }
}

class MyValue<T, U> {
    //�������������ͱ���ָ�����͵ĳ�Ա����
    private T value1;
    private U value2;
    //����������Ա������set������

    public void setValue(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    //����������Ա������get������

    public U getValue2() {
        return value2;
    }

    public T getValue1() {
        return value1;
    }
}

