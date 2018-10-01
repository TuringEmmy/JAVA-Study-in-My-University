package org.gaozou.book.javaabc.examples.ch21;

import java.io.Serializable;

/**
 * @author TuringEmmy
 *
 */
public class ExtendsTest {
    public static void main(String[] args) {
        //����ValueTest�Ķ��󣬲��ƶ����Ͳ���ΪInteger
        ValueTest<Integer> vt = new ValueTest<Integer>();
        //����vt�еĲ�����
        vt.setValue(new Integer(200));
        //��ȡvt�е�ֵ
        Integer inte = vt.getValue();
        //��ӡ���
        System.out.println("vt�����е�ֵ�ǣ�" + inte +
                "\n��ֵ������Number��ʵ����Comparable��Serializable");
    }
}

class ValueTest<T extends Number & Comparable & Serializable> {
    //���������Ͳ���ָ�����͵ĳ�Ա����
    private T value;
    //���ó�Ա������set����

    public T getValue() {
        return value;
    }
    //���ó�Ա������get����

    public void setValue(T value) {
        this.value = value;
    }
}

