package org.gaozou.book.javaabc.examples.ch22;

import java.util.Scanner;

/**
 * @author TuringEmmy
 *
 */
public class Bubble {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // ɨ�������ı�
        System.out.println("��������������飨�Կո�ָ�����");
        String st = reader.nextLine();
        System.out.println(st + " �����򷽷���");

        String[] ss = st.split("\\s+");

        sort(ss); // ����

        System.out.println("�����");

        StringBuffer sb = new StringBuffer();
        for (String a : ss) {
            sb.append(a).append(" ");
        }
        System.out.println("" + sb);
    }

    public static <E extends Comparable<E>> void sort(E[] array) {
        StringBuffer sb = new StringBuffer();
        int len = array.length;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                sb.append("�Ƚϣ�").append(array[j]).append(" ").append(array[j + 1]);

                if (array[j].compareTo(array[j + 1]) > 0) {
                    sb.append(" ð��");
                    swap(array, j, j + 1);
                }

                System.out.println(sb);
                sb.setLength(0);
            }

            for (E s : array) {
                sb.append(s).append(" ");
            }
            System.out.println("�� " + (len - i) + " �֣�" + sb);
            sb.setLength(0);
        }
        System.out.println("-----------");
    }

    // ��������Ԫ�ص�λ��

    public static <E extends Comparable<E>> void swap(E[] array, int a, int b) {
        E t = array[a];
        array[a] = array[b];
        array[b] = t;
    }
}
