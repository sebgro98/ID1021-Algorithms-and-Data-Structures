import java.util.Random;

public class Random_access {

    public static void main(String[] args) {

        double value = access(50000);
        System.out.println(value);
    }

    private static double access(int n) {

        int k = 1_000_000;
        int l = n;
        Random rnd = new Random();
        rnd.nextInt(n);

// fill the indx array with random number from 0 to n (not including n)
        int[] indx = new int[l];
        for (int i = 0; i < n; i++) {
            indx[i] = rnd.nextInt(n);
        }
        // fill the array with dummy values (why not 1)
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = 1;
        }

        int sum = 0;
        long t0 = System.nanoTime();
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < l; i++) {
                sum += array[indx[i]];
                // access the array with the index given by indx[i]
                // sum up the result
            }
        }
        long t_access = (System.nanoTime() - t0);
        t0 = System.nanoTime();
        // do the same loop iteration but only do a dummy add operation
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < l; i++) {
                sum += 1;
            }
        }
        long t_dummy = (System.nanoTime() - t0);
        return ((double) (t_access - t_dummy)) / ((double) k * (double) l);
    }

}
