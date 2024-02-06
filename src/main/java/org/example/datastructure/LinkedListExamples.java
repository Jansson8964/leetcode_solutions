package org.example.datastructure;

public class LinkedListExamples {
    ListNode head;

    public static void main(String[] args) {
        LinkedListExamples lle = new LinkedListExamples();
        lle.setupLinkedList();
        System.out.println(lle.countNodes());
    }

    /* 链表节点类 */
    class ListNode {
        int data;        // 节点值
        ListNode next;  // 指向下一节点的引用

        ListNode(int data) {
            this.data = data;
        }  // 构造函数
    }

    /* 初始化链表 1 -> 3 -> 2 -> 5 -> 4 */
// 初始化各个节点
    public void setupLinkedList() {
        head = new ListNode(1);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(4);

// 构建引用指向
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
    }

    int countNodes() {
        int count = 1;
        ListNode current = head;
        while (current.next != null) {
            count++;
            current = current.next;
        }
        return count;

    }
}
