import java.util.Random;
public class Main {

    public static void main(String args[]) {
        Random rnd = new Random();
        int loop = 10;
        int k = 3;

        int[] array1 = new int[500];
        int[] array2 = new int[5];

        for (int i = 0; i < array1.length + array2.length; i++) {

            //.....
        }

        LinkedList a = new LinkedList(rnd.nextInt(50),null);
        LinkedList b = new LinkedList(rnd.nextInt(50),null);

        for (int i = 0; i < loop; i++) {
           a.addLinkedList(rnd.nextInt(50));
        }

        long t0 = 0;
        long t1 = 0;
        long sum = 0;

        for (int i = 0; i < k; i++) {
            t0 = System.nanoTime();
            a.append(b);
            t1 = System.nanoTime();
            sum += t1 - t0;
        }

        System.out.println(" Time for appending a to b with 100 items in a " + sum/k + " nanoseconds");

    }


}
