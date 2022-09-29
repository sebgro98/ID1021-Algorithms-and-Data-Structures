import java.util.Random;
public class Main {

    public static void main (String[] args) {
        Random rnd = new Random();
        int loop = 1_000_000;

        int n = 9600;
        BinaryTree object = new BinaryTree();
        for (int j = 0; j < n; j++) {
            object.add(rnd.nextInt(n),rnd.nextInt(n));
        }

        long t_total = 0;
        for (int i = 0; i < loop; i++) {

            long t0 = System.nanoTime();
            object.lookup(rnd.nextInt(n));
            t_total += (System.nanoTime() - t0);
        }

        System.out.println(" Time for lookup " + t_total / loop + " nanoseconds");

    }
}
