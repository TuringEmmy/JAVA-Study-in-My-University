package cn.legeyung.study13;

import java.util.Scanner;

/**
 * @author TuringEmmy
 *
 */
public class GameTest {
    public static void main(String[] args) {
        System.out.println("��������Ϸ����");
        int Guess = (int) MathTest();        //���������
        int Num;                            //��������
        boolean right = true;                //�жϽ��
        while (right)                         //֪����������ѭ������
        {
            // ��ʾ�û�����һ���������֡�
            System.out.println("������һ����������1-100֮��:");
            Scanner scan = new Scanner(System.in);
            Num = scan.nextInt();
            System.out.println("�����������Ϊ��" + Num);
            // �ж��û���������Ƿ���ȷ
            if (Num > Guess) {
                System.out.println("�������������������������Ŭ����");
            } else if (Num < Guess) {
                System.out.println("���������С��������������Ŭ����");
            } else {
                System.out.println("��ϲ���¶�����");
                System.out.println("���������:" + Guess);
                right = false;
            }
        }
    }

    /**
     * ���ڲ���һ�������
     *
     * @return �����
     */
    public static double MathTest() {
        double MathTest = Math.random() * 100;
        return MathTest;
    }
}

