import java.util.Random;

public class LinkedList {
    private NodeList head;
    private NodeList tail;

    private int length;

    static class NodeList {
        int data; // value of the node
        NodeList next;

        private NodeList(int data) {
            this.data = data;
        }

    }

    public LinkedList() {
        this.tail = null;
        this.head = null;
        this.length = 0;

    }

    public void push(int value) {
       NodeList newNode = new NodeList(value);
        newNode.next = head;
        head = newNode;

    }

    public NodeList tail() {
        return this.tail;
    }

    public void deleteNode(NodeList del) {

        if (head == del) {
            head = del.next;
        }

        else {
            NodeList temp = head;
            NodeList previousToTemp = null;
            while (temp.next != del.next) {
                previousToTemp = temp; // 1, 2, 6
                temp = temp.next; // 1, 2, 6, 5
            }
            previousToTemp.next = temp.next;
        }

    }

        public void printForward () {
            if (head == null) {
                return;
            }
            NodeList temp = head;
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        private boolean isEmpty () {
            return length == 0; // head == null
        }

        private int getLength () {
            return length;
        }

        public NodeList[] copyArr ( int n){
            NodeList temp = head;
            NodeList[] nodeArr = new NodeList[n];
            int i = 0;
            while (temp != null) {
                nodeArr[i] = temp;
                temp = temp.next;
                i++;
            }
            return nodeArr;
        }

    public void addNode (NodeList node) {
        node.next = head;
        head = node;
    }
    public NodeList SendRandomIndex (NodeList[] nodeArr, int length) {
        Random rnd = new Random();
        return nodeArr[rnd.nextInt(length - 1)];

    }

}
