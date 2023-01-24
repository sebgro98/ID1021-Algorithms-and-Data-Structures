package HP35;

import java.util.EmptyStackException;

public class Stack {
    final static int stackSize = 4;
    int[] stack = new int[stackSize];
    int pointer = -1;

    public void push(int data) {
        if (FullStack()) {
            throw new StackOverflowError("Stack is full");

        }
        stack[++pointer] = data;
    }

    public int pop() {

        if(EmptyStack()) {
            throw new EmptyStackException();
        }
        int data;

        data = stack[pointer];
        stack[pointer--] = 0;
        return data;
    }

    public void show() {
        for (int i : stack) {
            System.out.println(i + " ");

        }
    }

    public boolean FullStack() {
        return pointer + 1 == stack.length;
    }
    public boolean EmptyStack() {
        return pointer == -1;
    }



}

