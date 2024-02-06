package org.example.datastructure;

import java.util.ArrayList;

public class StackExample {
    // 栈就像叠猫猫，先进后出
    // 队列就像猫猫排队，先进先出
    private ArrayList<Integer> stack = new ArrayList<>();

    // if stack is empty return size==0
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    // return size of stack  获取栈的长度
    public int size() {
        return stack.size();
    }

    // push element into stack  入栈
    public void push(int num) {
        stack.add(num);
    }

    // pop element from stack  出栈
    // if stack is empty throw exception
    public int pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return stack.remove(stack.size() - 1);

    }
    // peek element from stack  访问栈顶元素
    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return stack.get(stack.size() - 1);
    }

}
