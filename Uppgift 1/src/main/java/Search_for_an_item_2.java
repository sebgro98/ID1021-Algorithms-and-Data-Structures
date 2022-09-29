
import java.util.Random;

public class Search_for_an_item_2 {
    public static void main(String[] args) {
        int m = 1000;
        long t_total = 0;
        int sum = 0;
        int n = 800;
        int k = 10000;
        Random rnd = new Random();
        int[] keys = new int[m];
        int[] array = new int[n];
        for (int j = 0; j < k; j++) {
            // fill the keys array with random number from 0 to 10*n
            for (int i = 0; i < n; i++) {
                keys[i] = rnd.nextInt(n * 10);
            }
// fill the array with with random number from 0 to 10*n
            for (int i = 0; i < n; i++) {
                array[i] = rnd.nextInt(n * 10);
            }
            long t0 = System.nanoTime();
            for (int ki = 0; ki < m; ki++) {
                int key = keys[ki];
                for (int i = 0; i < n ; i++) {
                    if (array[i] == key) {
                        sum++;
                        break;
                    }
                }
            }
            t_total += (System.nanoTime() - t0);
        }

        System.out.println(t_total/sum);
    }

    }

