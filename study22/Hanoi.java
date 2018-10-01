package org.gaozou.book.javaabc.examples.ch22;

import java.util.Scanner;


/**
 * @author TuringEmmy
 *
 */
public class Hanoi {
    private static int i = 0;

    public static void main(String[] args) {
        int n = 0;
        Scanner reader = new Scanner(System.in); // ɨ�������ı�
        System.out.println("����������ӵ�������");
        n = reader.nextInt();
        System.out.println(n + " �㺺ŵ���Ľⷨ�ǣ�");

        // ��n�����Ӵ�A�ƶ���C���м����B
        move(n, 'A', 'B', 'C');

        System.out.println("Total: " + i);
        System.exit(0);
    }

    // �ƶ����ӵķ�������n�����Ӵ�from�Ƶ�to��inter����

    public static void move(int no, char from, char inter, char to) {
        i++;
        if (no == 1) {
            System.out.println("Move plate 1 from " + from + " to " + to);
        } else {
            move(no - 1, from, to, inter); // �Ƚ�n-1�����Ӵ�from�ƶ���inter
            System.out.println("Move plate " + no + " from " + from + " to " + to);
            move(no - 1, inter, from, to); // �ٽ�n-1�����Ӵ�inter�ƶ���to
        }
    }
}
