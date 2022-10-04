import java.util.EmptyStackException;

public class ArrayQueue {

    Integer n, head, tail;
    Integer[] queue;

    public ArrayQueue(Integer size) {
        queue = new Integer[size];
        n = size;
        head = tail = 0;
    }

    public void add(Integer value) {
        if(tail == head && queue[tail] != null)
            increaseSize();
        queue[tail++] = value;
        if (tail == n) tail = 0;

    }

    public Integer remove() {
        if (queue[head] == null) return null;

        Integer returnValue = queue[head];
        queue[head++] = null;
        return returnValue;
    }

    private void increaseSize() {
        Integer[] newQueue = new Integer[2*n];
        for (int j = head; j < n; j++) {
            newQueue[j - head] = queue[j];
        }
        for (int j = 0; j < head; j++) {
            newQueue[j + n - head] = queue[j];
        }
        queue = newQueue;
        tail = n;
        n = 2 * n;
        head = 0;
    }

    public void show() {
        for (int i = 0; i < queue.length; i++) {
            System.out.println(queue[i]);
        }
    }

}
