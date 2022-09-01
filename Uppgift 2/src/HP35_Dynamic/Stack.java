package HP35_Dynamic;

import java.util.EmptyStackException;

public class Stack {
  int stackSize = 4;
    int[] stack = new int[stackSize];
    int pointer = -1;

    public void push(int data) {
        if (FullStack()) {
           System.out.println("Stack is Full! Adding more space!");
            increaseStackCapacity();
            System.out.println("The length when stack is getting bigger" + " " + stack.length);
            System.out.println("This is where pointer is pointing" + " " + pointer);
        }
        stack[++pointer] = data;

    }

    public int pop() {

        if(EmptyStack()) {
            throw new EmptyStackException();
        }
        if (pointer < stackSize/2) {
            System.out.println("Useless space, making stack smaller!");
            decreaseStackCapacity();
            System.out.println("The length when stack is getting smaller" + " " +  stack.length);

        }
        int data;
        data = stack[pointer];
        stack[pointer--] = 0;
        return data;
    }


    public boolean FullStack() {
        return pointer + 1 == stack.length;
    }
    public boolean EmptyStack() {
        return pointer == -1;
    }
    private void decreaseStackCapacity() {
        int[] newStack = new int[this.stackSize/2];
        for (int i = 0; i < stackSize/2; i++) {
            newStack[i] = this.stack[i];
        }
        this.stack = newStack;
        this.stackSize = this.stackSize /2;
    }
    private void increaseStackCapacity() {
        int[] newStack = new int[this.stackSize*2];
        for (int i = 0; i < stackSize; i++) {
            newStack[i] = this.stack[i];
        }
        this.stack = newStack;
        this.stackSize = this.stackSize * 2;
    }
    public void show() {
        for (int i : stack) {
            System.out.println(i + " ");

        }
    }


}

