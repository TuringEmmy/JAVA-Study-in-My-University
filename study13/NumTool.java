package cn.legeyung.study13;

import java.util.regex.Pattern;

/**
 * @author TuringEmmy
 *
 */
public class NumTool {
    public static boolean isNum(String s) {
        for (int i = s.length(); --i >= 0;) {
            if (!Character.isDigit(s.charAt(i))) { // ͨ��Java�����ж��Ƿ�������
                return false;
            }
        }
        return true;
    }

    public static boolean isNumByRegex(String s) {
        Pattern p = Pattern.compile("[0-9]*"); // ����������ʽ
        return p.matcher(s).matches();
    }

    public static boolean isNumByAscii(String s) {
        for (int i = s.length(); --i >= 0;) {
            int c = s.charAt(i);
            if (c < 48 || c > 57) { // �ж��ַ�c�Ƿ���48-57֮��
                return false;
            }
        }
        return true;
    }
    // ���ᳫʹ�ô˷���

    public static boolean isNumByException(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) { // ��׽ NumberFormatException
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "789";
        System.out.println(s1 + " ��������" + isNum(s1));
        String s2 = "667";
        System.out.println(s2 + " ��������" + isNumByRegex(s2));
        String s3 = "567";
        System.out.println(s3 + " ��������" + isNumByAscii(s3));
        String s4 = "abc";
        System.out.println(s4 + " ��������" + isNum(s4));
        String s5 = "555dd";
        System.out.println(s5 + " ��������" + isNumByRegex(s5));
        String s6 = "gh567";
        System.out.println(s6 + " ��������" + isNumByAscii(s6));
    }
}
