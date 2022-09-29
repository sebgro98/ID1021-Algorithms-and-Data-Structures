import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Random rnd = new Random();
        int n = 5;
        LinkedList node1 = new LinkedList();
        node1.push(10);
        node1.push(5);
        node1.push(6);
        node1.push(2);
        node1.push(1);
        LinkedList.NodeList[] nodeArr1 = node1.copyArr(n);
        node1.printForward();
        node1.deleteNode(nodeArr1[4]);
        node1.printForward();
        //node1.addNode(nodeArr1[2]);
        //node1.printForward();

        LinkedList.NodeList newNode1 = node1.SendRandomIndex(nodeArr1, n);


       /* DoublyLinkedList node = new DoublyLinkedList();

        node.push(2);
        node.push(5);
        node.push(8);
        node.push(1);
        node.push(3);
        DoublyLinkedList.Node[] nodeArr = node.copyArr(n);
        //DoublyLinkedList.Node newNode = node.SendRandomIndex(nodeArr, n);
        node.printForward();
        node.deleteNode(nodeArr[1]);
        node.printForward();
       // node.addNode(nodeArr[2]);
        //node.printBackward();
*/

    }

}

