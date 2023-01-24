import java.util.Random;

public class Search_for_an_item_1 {

    public static void main(String[] args) {
        int m = 1000;
        int n = 1;
        int k = 10000;
        Random rnd = new Random();

        int[] keys = new int[m];
// fill the keys array with random number from 0 to 10*n
        for (int i = 0; i < n; i++) {
            keys[i] = rnd.nextInt(n * 10);
        }
        int[] array = new int[n];
// fill the array with with random number from 0 to 10*n
        for (int i = 0; i < n; i++) {
            array[i] = rnd.nextInt(n * 10);
        }
        int sum = 0;
        long t0 = System.nanoTime();
        for (int j = 0; j < k; j++) {
            for (int ki = 0; ki < m; ki++) {
                int key = keys[ki];
                for (int i = 0; i < n; i++) {
                    if (array[i] == key) {
                        sum++;
                        break;
                    }
                }
            }
        }
        long t_access = (System.nanoTime() - t0);
        System.out.println(t_access / (sum));
    }
}
