import java.util.Random;

public class DoublyLinkedList {

    private Node head; // pointing to the first node
    private Node tail; // pointing to the last node
    private int length; // the number of nodes in the list

    static class Node {
        int data; // value of the node
        Node next;
        Node prev;

        private Node(int data ) {
            this.data = data;
        }

    }
 // To make sure the list is empty at start.
    public DoublyLinkedList() {

        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    private boolean isEmpty() {
        return length == 0; // head == null
    }

    private int getLength() {
        return length;
    }

    public void push (int value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            tail = newNode;
        }
        else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;

    }

    public void printForward() {
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printBackward () {
        if(tail == null) {
            return;
        }
        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    public void deleteNode(Node del) {

        // If node to be deleted is head node
        if (head == del) {
            head = del.next;
            length--;
        }

        // Change next only if node to be deleted
        // is NOT the last node
        if (del.next != null) {
            del.next.prev = del.prev;
            length--;
        }

        // Change prev only if node to be deleted
        // is NOT the first node
        if (del.prev != null) {
            del.prev.next  = del.next;
            length--;
        }


        // Finally, free the memory occupied by del
        return;
    }
    public Node SendRandomIndex (Node[] nodeArr, int length) {
        Random rnd = new Random();
        return nodeArr[rnd.nextInt(length - 1)];

    }

    public void addNode (Node node) {
        if (isEmpty()) {
            tail = node;
        } else {
            head.prev = node;
        }
        node.next = head;
        head = node;
        length++;
    }

    public Node[] copyArr(int length) {
        Node temp = head;
        Node[] nodeArr = new Node[length];
        int i = 0;
        while (temp != null) {
            nodeArr[i] = temp;
            temp = temp.next;
            i++;
        }
        return nodeArr;
    }



}
