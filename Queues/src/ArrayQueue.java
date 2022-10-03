import java.util.EmptyStackException;

public class ArrayQueue {
    Integer stackSize = 5;
    Integer[] stack = new Integer[stackSize];
    Integer tail = -1;
    Integer head = 0;
    Integer prevTail = tail;
    Integer jump = 0;
    Integer jumpBack = 0;

    public void push(Integer data) {
        if (FullStack() && head != 0) {
            prevTail--;
            if(tail + 1 == stack.length && stack[head - 1] == null){
                tail = -1;
            }
            else {
                bigger();
                tail = prevTail + 1;
                prevTail++;
                jump = prevTail;
            }
        }
       if ((FullStack()) ) {
            bigger();
        }
        stack[++tail] = data;
        prevTail++;
    }
    public void show() {
        for (int i = 0; i < stack.length; i++) {
            System.out.println(stack[i]);
        }
    }
    public void pop() {

        if (EmptyStack()) {
            throw new EmptyStackException();
        }

       if (head.equals(jump + 1) && jump != 0)  {
           jumpBack = jump + 1;
           head = 0;
        }
      else if (stack[head + 1] == null && jump != 0){
            head = jumpBack;
        }
        stack[head] = null;
        head++;
    }

    public boolean FullStack() {
        return prevTail + 1 == stack.length;
    }

    public boolean EmptyStack() {
        return tail == -1;
    }

    public void bigger() {
        Integer[] biggerStack = new Integer[stack.length * 2];

        for (int i = 0; i < stack.length; i++) {
            biggerStack[i] = stack[i];
        }
        stack = biggerStack;

    }

    public Integer getPopped() {

        return stack[head];

    }

}
