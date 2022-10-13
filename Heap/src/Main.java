public class Main {

    public static void main (String[] args ) {
        HeapList queue = new HeapList();
        queue.add(12);
        queue.add(7);
        queue.add(120);
        queue.add(132);
        queue.add(11);


        queue.printForward();
        queue.remove();
        queue.printForward();
    }
}
