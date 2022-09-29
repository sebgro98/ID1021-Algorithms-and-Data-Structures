import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 4096;
        int num = 10;
        long t_total = 0;
        int loop = 100_0000;
        Random rnd = new Random();

        DoublyLinkedList node = new DoublyLinkedList();
        for (int j = 0; j < n; j++) {
            node.push(rnd.nextInt(n * 5));
        }
        DoublyLinkedList.Node[] nodeArr = node.copyArr(n);


        LinkedList nodeList = new LinkedList();
        for (int j = 0; j < n; j++) {
            nodeList.push(rnd.nextInt(loop * 5));
        }
        LinkedList.NodeList[] nodeArrList = nodeList.copyArr(n);


        //System.out.println("Time to delete one nod and add the same one to double linked list");
        //for (int k = 0; k < num; k++) {
            for (int i = 0; i < loop; i++) {
                DoublyLinkedList.Node newNode = node.SendRandomIndex(nodeArr, n);
                long t0 = System.nanoTime();
                node.deleteNode(newNode);
                node.addNode(newNode);
                t_total += (System.nanoTime() - t0);
            }
            //System.out.println(" Length of list " + n + ", time = " + t_total / loop + " nanoseconds");
            //n = n * 2;

//        }

        System.out.println(" ");

        //n = 8;
        t_total = 0;

        //System.out.println("Time to delete one nod and add the same one to single linked list");
            for (int i = 0; i < loop; i++) {
                LinkedList.NodeList newNode = nodeList.SendRandomIndex(nodeArrList, n);
                long t0 = System.nanoTime();
                nodeList.deleteNode(newNode);
                nodeList.addNode(newNode);
                t_total += (System.nanoTime() - t0);
            }
            //System.out.println(" Length of list " + n + ", time = " + t_total / loop + " nanoseconds");
            //n = n * 2;

        System.out.println(" ");
        //n = 8;
        t_total = 0;

        System.out.println("Time to add one nod for a double linked list");
            for (int i = 0; i < loop; i++) {
                DoublyLinkedList.Node newNode = node.SendRandomIndex(nodeArr, n);
                node.deleteNode(newNode);
                long t0 = System.nanoTime();
                node.addNode(newNode);
                t_total += (System.nanoTime() - t0);
            }
            System.out.println(" Length of list " + n + ", time = " + t_total / loop + " nanoseconds");
            //n = n * 2;


        System.out.println(" ");
        //n = 8;
        t_total = 0;

        System.out.println("Time to add one nod for a single linked list");

            for (int i = 0; i < loop; i++) {
                LinkedList.NodeList newNode = nodeList.SendRandomIndex(nodeArrList, n);
                nodeList.deleteNode(newNode);
                long t0 = System.nanoTime();
                nodeList.addNode(newNode);
                t_total += (System.nanoTime() - t0);
            }
            System.out.println(" Length of list " + n + ", time = " + t_total / loop + " nanoseconds");
            //n = n * 2;

        System.out.println(" ");
        //n = 8;
        t_total = 0;

        System.out.println("Time to delete one nod for a double linked list");
            for (int i = 0; i < loop; i++) {
                DoublyLinkedList.Node newNode = node.SendRandomIndex(nodeArr, n);
                long t0 = System.nanoTime();
                node.deleteNode(newNode);
                t_total += (System.nanoTime() - t0);
                node.addNode(newNode);

            }
            System.out.println(" Length of list " + n + ", time = " + t_total / loop + " nanoseconds");



        System.out.println(" ");

        t_total = 0;

        System.out.println("Time to delete one nod for a single linked list");
            for (int i = 0; i < loop; i++) {
                LinkedList.NodeList newNode = nodeList.SendRandomIndex(nodeArrList, n);
                long t0 = System.nanoTime();
                nodeList.deleteNode(newNode);
                t_total += (System.nanoTime() - t0);
                nodeList.addNode(newNode);

            }
            System.out.println(" Length of list " + n + ", time = " + t_total / loop + " nanoseconds");



    }
}
