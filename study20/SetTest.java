package org.gaozou.book.javaabc.examples.ch20;

import java.util.*;

/**
 * @author TuringEmmy
 *
 */
public class SetTest {
    public static void main(String[] args) { // java��������ڴ�
        hashSetResult();
        treeSetResult();
        linkedHashSetResult();
        Set hashSet = new HashSet();
        addSetElement(hashSet);
        hashSet.add("��ѧ");                 // Set������Ԫ���ظ�
        hashSet.add("����");
        System.out.println("\nΪhashSet������ѧ, ����Ԫ�غ�->: ");
        showElement(hashSet);             // ���÷�����ʾԪ��
        hashSet.remove("����");             // ɾ��Ԫ��
        System.out.println("\nhashSetɾ������Ԫ�غ�->: ");
        showElement(hashSet);             // ���÷�����ʾԪ��
        List list = new ArrayList();             // ����һ���б���
        list.add("��ѧ");
        list.add("��ѧ");
        list.add("����");
        hashSet.addAll(list);                 // ���б�����ӵ�Set��
        System.out.println("\nhashSet���һ�����ϵ�����Ԫ�غ�->: ");
        showElement(hashSet);
        hashSet.retainAll(list);                 // ɾ�����б����е�Ԫ��֮���Ԫ��
        System.out.println("\nhashSetɾ�������б���֮���Ԫ�غ�->: ");
        showElement(hashSet);             // ���÷�����ʾԪ��
        hashSet.removeAll(list);             // ɾ�������е�Ԫ��
        System.out.println("\nhashSetɾ�������е�Ԫ�غ�->: ");
        showElement(hashSet);             // ���÷�����ʾԪ��
        // ��ȡSet��Ԫ�صĸ���
        System.out.println("\thashSet�е�ǰԪ�صĸ���: " + hashSet.size());
        // �ж�Set�е�Ԫ���Ƿ�Ϊ��
        System.out.println("\thashSet�е�ǰԪ��Ϊ0��  " + hashSet.isEmpty());
    }

    public static void hashSetResult() {             // ʹ��HashSet����Ԫ��
        Set hashSet = new HashSet();
        addSetElement(hashSet);             // ���÷�����ʼ��Ԫ��
        System.out.println("ʹ��HashSet�洢������Ԫ������->�� ");
        showElement(hashSet);             // ���÷�����ʾԪ��
    }

    public static void treeSetResult() {             // ʹ��TreeSet����Ԫ��
        Set treeSet = new TreeSet();
        addSetElement(treeSet);             // ���÷�����ʼ��Ԫ��
        System.out.println("\nʹ��TreeSet�洢������Ԫ������->��");
        showElement(treeSet);                 // ���÷�����ʾԪ��
    }

    public static void linkedHashSetResult() {     // ʹ��LinkedHashSet����Ԫ��
        Set linkedHashSet = new LinkedHashSet();
        addSetElement(linkedHashSet);         // ���÷�����ʼ��Ԫ��
        System.out.println("\nʹ��LinkedHashSet�洢������Ԫ������->��");
        showElement(linkedHashSet);         // ���÷�����ʾԪ��
    }

    public static void addSetElement(Set set) { // ��ʼ��Set��Ԫ��
        if (set != null) {
            set.add("��ѧ");
            set.add("����");
            set.add("����");
            set.add("��ѧ");
            set.add("����");
        }
    }

    public static void showElement(Set set) {         // ���set��Ԫ��
        if (set != null && set.size() > 0) {
            Iterator it = set.iterator();         // ��õ�����Iterator
            while (it.hasNext()) {             // ѭ�����Setÿ��Ԫ��
                System.out.print(it.next() + " ");
            }
        } else {
            System.out.println("û��Ԫ�أ�");
        }
        System.out.println();                 // ����
    }
}
