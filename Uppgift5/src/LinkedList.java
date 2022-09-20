public class LinkedList {
    int head;
    LinkedList tail;

    public LinkedList(int item, LinkedList list) {
        head = item;
        tail = list;
    }

    public void append(LinkedList b) {
        LinkedList nxt = this;
        while (nxt.tail != null) {
            nxt = nxt.tail;
        }
        nxt.tail = b;
    }

    public int head() {
        return this.head;
    }
    public LinkedList tail() {
        return this.tail;
    }

    public void addLinkedList(int item) {
        LinkedList list = new LinkedList(item,null);
        append(list);
    }

    public void print() {
        LinkedList nxt = this;
        while (nxt != null) {
            System.out.println(nxt.head);
            nxt = nxt.tail;
        }
    }
}
