package org.example.datastructure;

public class LinkedListQueue {
    class ListNode {
        int data;        // 节点值
        ListNode next;  // 指向下一节点的引用

        ListNode(int data) {
            this.data = data;
        }  // 构造函数
    }

    private ListNode front, rear;
    private int queSize = 0;

    // get the size of the queue
    public int size() {
        return queSize;
    }

    // if the queue is empty
    public boolean isEmpty() {
        return size() == 0;
    }


    // add an element to the queue
    public void push(int num) {
        ListNode node = new ListNode(num);
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
        }
        queSize++;
    }

    // remove an element from the queue
    public int pop() {
        int num = peek();
        front = front.next;
        queSize--;
        return num;
    }

    // get the front element of the queue
    private int peek() {
        if (isEmpty())
            throw new IndexOutOfBoundsException();
        return front.data;
    }
}
