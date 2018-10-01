package org.gaozou.book.javaabc.examples.ch16;

import java.lang.reflect.Field;

/**
 * @author TuringEmmy
 *
 */
public class FieldTest {
    public static void main(String[] args) throws IllegalAccessException {
        House house = new House("George", 160, 300, "Beijing", "Happy House");
        Class c = house.getClass();
        Field[] fields = c.getDeclaredFields(); // ȡ�����г�Ա����
        System.out.println("���г�Ա������" + fields.length);
        System.out.println("------------------");
        for (Field field : fields) {
            field.setAccessible(true); // ���ô˱����Ŀɷ�����Ϊ true
            Class t = field.getType();  // ȡ�ô˱���������
            if (t == String.class) {
                System.out.println(field.getName() + " ��" + field.get(house));
            }
            if (t == int.class) {
                System.out.println(field.getName() + " ��" + field.getInt(house));     // ȡ�� int ���͵�ֵ
            }
        }
        System.out.println("\nΪ����������ֵ��");
        System.out.println("----------------");
        for (Field field : fields) {
            field.setAccessible(true);
            String n = field.getName();  // ȡ�ô˱���������
            if (n.equalsIgnoreCase("owner")) {
                field.set(house, "George Li"); // Ϊ�˱���������ֵ
            }
            if (n.equalsIgnoreCase("space")) {
                field.set(house, field.getInt(house) * 2);
            }
            if (n.equalsIgnoreCase("price")) {
                field.set(house, field.getInt(house) * 2);
            }
            if (n.equalsIgnoreCase("address")) {
                field.set(house, "Beijing China");
            }
            if (n.equalsIgnoreCase("name")) {
                field.set(house, "Brilliant House");
            }
        }
        for (Field field : fields) {
            System.out.println(field.getName() + " ��" + field.get(house));
        }
    }
}

