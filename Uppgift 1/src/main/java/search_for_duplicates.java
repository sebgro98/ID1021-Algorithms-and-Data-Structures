import java.util.Random;

public class search_for_duplicates {
    public static void main(String[] args) {
        //int m = 1000;
        long t_total = 0;
        int sum = 0;
        int n = 1000;
        int k = 30000;
        Random rnd = new Random();
        int[] keys = new int[n];
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
            for (int ki = 0; ki < n; ki++) {
                int key = keys[ki]; //17
                for (int i = 0; i < n ; i++) {
                    if (array[i] == key) {
                        for(int l = 0; l < n; l++) {
                            if (keys[l] == key) {
                                sum++;
                                break;
                            }

                        }
                        break;
                    }
                }
            }
            t_total += (System.nanoTime() - t0);
        }

        System.out.println(t_total/sum);
    }

}

