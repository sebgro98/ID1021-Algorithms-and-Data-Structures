public class HeapList {

    public Node head;
    public int length;
    public Node tail;
    public Node smallest;

    private class Node {
        public Integer data;

        public Node next;
        public Node tail;

        Node(Integer data) {
            this.data = data;
            this.next = null;

        }
    }

    public HeapList() {
        head = null;
        tail = null;
        this.length = 0;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        }
        while (head != null && head.data > value) {

        }
    }


    public Integer remove() {
        Integer temp;
        if (head == null) {
            return null;
        }
        temp = head.data;
        head = head.next;
        return temp;
    }


    public void printForward() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return length == 0;
    }

}
