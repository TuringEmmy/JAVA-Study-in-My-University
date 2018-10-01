package org.gaozou.book.javaabc.examples.ch22;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author TuringEmmy
 *
 */
public class LinkedListRemove {
    private static LinkedList<String> link = new LinkedList<String>();

    public static void main(String[] args) {
        link.addAll(0, Arrays.asList(
                "First.",
                "Second",
                "Third",
                "Fourth",
                "Fifth",
                "Fifth",
                "Sixth",
                "Sixth"
        ));
        echo("����Ԫ��");

        link.remove();
        echo("ִ�� remove() ��");

        link.remove(0);
        echo("ִ�� remove(0) ��");

        link.remove("Third");
        echo("ִ�� remove(\"Third\") ��");

        link.removeFirst();
        echo("ִ�� removeFirst() ��");

        link.removeFirstOccurrence("Fifth");
        echo("ִ�� removeFirstOccurrence(\"Fifth\") ��");

        link.removeLast();
        echo("ִ�� removeLast() ��");

        link.removeLastOccurrence("Fifth");
        echo("ִ�� removeLastOccurrence(\"Fifth\") ��");

    }

    public static void echo(String action) {
        System.out.println("");
        System.out.println(action);
        System.out.println("-------------------------");
        for (int i = 0; i < link.size(); i++) {
            System.out.println(i + " : " + link.get(i));
        }
        System.out.println("-------------------------");
    }
}
