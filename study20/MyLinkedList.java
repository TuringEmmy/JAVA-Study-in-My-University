package org.gaozou.book.javaabc.examples.ch20;


/**
 * @author TuringEmmy
 *
 */
public class MyLinkedList {
    public static void main(String[] args) {
        ImpQueue myQueue = new LinkedList(); // ʵ��������Queue����
        myQueue.inQueue("\tThankyou");         // ���Ԫ�����
        myQueue.inQueue("\tThanks");         // ���Ԫ�����
        System.out.println("Queue������Ԫ�س��������");
        while (!myQueue.isEmpty()) {         // ѭ���ж϶����Ƿ�Ϊ��
            System.out.println(myQueue.outQueue());    // ��Ϊ������������е�Ԫ��
        }
        ImpStack myStack = new LinkedList();// ʵ����Stackջ����
        System.out.println("\nStackջ��Ԫ�س�ջ�����");
        myStack.push("\tabcdefg");             // ���Ԫ����ջ
        myStack.push("\tgfedcba");             // ���Ԫ����ջ
        while (!myStack.isEmpty()) {         // ѭ���ж�ջ�Ƿ�Ϊ��
            System.out.println(myStack.pop());// ��Ϊ���������ջԪ��
        }
    }
}

abstract class AbsMyList {
    protected int len = 0;         // ����

    protected AbsMyList() {     // Ĭ�Ϲ��췽��
    }

    abstract public boolean add(Object o);         // ����������ĩβ���һ��Ԫ��

    abstract public Object getElement(int index);     // ���ָ��Ԫ��

    abstract public boolean isElement(Object o);     // �ж��Ƿ����Ԫ��

    abstract int indexOf(Object o);             // �ж�Ԫ�ص�λ��

    abstract public boolean deleteElement(Object o);// �Ƴ�Ԫ��

    abstract public void clear();                 // ���

    public int len() {                         // ��ó��ȴ�С
        return this.len;
    }

    public boolean isEmpty() {     // �ж��Ƿ�Ϊ��
        return this.len == 0;
    }
}

interface ImpQueue {             // ���нӿ�

    void inQueue(String o);     // ���

    Object outQueue();         // ����

    boolean isEmpty();        // �ж��Ƿ�Ϊ��
}

interface ImpStack {             // ջ�ӿ�

    void push(Object o);         // Ԫ����ջ

    Object pop();             // Ԫ�س�ջ

    boolean isEmpty();         // �Ƿ�Ϊ��
}

class LinkedList extends AbsMyList implements ImpQueue, ImpStack {
    private static class InnerMyEntry {     // ��̬�ڲ���
        Object object;             // ����
        InnerMyEntry next;         // ��һ������
        InnerMyEntry previous;     // ��һ������
        // �������Ĺ��췽�����г�ʼ��

        InnerMyEntry(Object object, InnerMyEntry next, InnerMyEntry previous) {
            this.object = object;
            this.next = next;
            this.previous = previous;
        }
    }

    private InnerMyEntry header = new InnerMyEntry(null, null, null);// ����ʵ�����

    public LinkedList() {                     // Ĭ�Ϲ��췽�����г�ʼ��
        this.header.next = this.header.previous = this.header;
    }

    private InnerMyEntry addBefore(Object o, InnerMyEntry e) {     // ��Ӷ���֮ǰ�Ĳ�������
        InnerMyEntry newEntry = new InnerMyEntry(o, e, e.previous);    // ����ʵ�����
        newEntry.previous.next = newEntry;
        newEntry.next.previous = newEntry;
        this.len++;
        return newEntry;
    }

    public boolean add(Object o) {             // ��Ӷ���
        this.addBefore(o, header);
        return true;
    }

    public void clear() {                     // ��ն���
        InnerMyEntry e = this.header.next;
        while (e != this.header) {             // �жϽ���ѭ��
            InnerMyEntry next = e.next;
            e.next = e.previous = null;     // ��ն���
            e.object = null;                 // ��ն���
            e = next;
        }
        this.header.next = this.header.previous = this.header;
        this.len = 0;
    }

    public boolean isElement(Object o) {     // �Ƿ��������
        return this.indexOf(o) != -1;
    }

    public Object getElement(int index) {     // ���ָ���Ķ���
        InnerMyEntry myEntry = this.entry(index);
        if (myEntry == null)
            return null;
        return myEntry.object;
    }

    public int indexOf(Object o) {             // ��ö�����ջ������е�λ��
        int index = 0;
        if (o == null) {
            for (InnerMyEntry e = this.header.next; e != this.header; e = e.next) {
                // ѭ�����Ԫ�ض���
                if (e.object == null)
                    return index;
                index++;
            }
        } else {
            for (InnerMyEntry e = this.header.next; e != this.header; e = e.next) {
                // ѭ�����Ԫ�ض���
                if (o.equals(e.object))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public boolean deleteElement(Object o) {         // �Ƴ�����
        if (o == null) {
            // ѭ����Ԫ�ض���
            for (InnerMyEntry e = header.next; e != header; e = e.next) {
                if (e.object == null) {
                    return this.deleteElement(e);     // �Ƴ�����
                }
            }
        } else {
            for (InnerMyEntry e = header.next; e != header; e = e.next) {    // ѭ����Ԫ�ض���
                if (o.equals(e.object)) {
                    return this.deleteElement(e);     // �Ƴ�����
                }
            }
        }
        return false;
    }

    public Object outQueue() {                 // ���ӷ���
        Object result = this.header.next.object; // ��ö���
        this.deleteElement(this.header.next);     // �Ƴ�����
        return result;
    }

    public void inQueue(String o) {         // ��ӷ���
        this.addBefore(o, header);             // ��������Ӷ���
    }

    public Object pop() {                         // ��ջ����
        Object result = this.header.previous.object;// ��ö���
        this.deleteElement(this.header.previous);     // �Ƴ�����
        return result;
    }

    public void push(Object o) {         // ��ջ
        this.addBefore(o, header);     // ��������Ӷ���
    }

    private boolean deleteElement(InnerMyEntry e) { // �Ƴ�����
        if (e == header) {
            return false;
        }
        e.previous.next = e.next;                     // ���¸�ֵ
        e.next.previous = e.previous;                 // ���¸�ֵ
        e.next = e.previous = null;                 // ���
        e.object = null;
        this.len--;
        return true;
    }

    private InnerMyEntry entry(int index) {         // ���ָ���Ķ���
        if (index < 0 || index >= this.len) {         // �ж�ָ��Ԫ�ص��±�
            return null;
        }
        InnerMyEntry e = header;
        if (index < (this.len >> 1)) {                 // �ж�ѭ�����ָ����ʵ��
            for (int i = 0; i <= index; i++)
                e = e.next;
        } else {
            for (int i = this.len; i > index; i--)
                e = e.previous;
        }
        return e;
    }
}
