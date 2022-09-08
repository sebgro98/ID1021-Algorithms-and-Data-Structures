import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Random rnd = new Random();
        int length = 1280;
        int[] unsortedArray = Unsorted.generate_array(length);
        int loop = 1_000_000;
        int[] sortedArray1 = Sorted.sorted(length);
        int[] sortedArray2 = Sorted.sorted(length);

      /*  long t0 = System.nanoTime();
        for (int i = 0; i < loop; i++) {

            Unsorted.search_Unsorted(unsortedArray, rnd.nextInt(length * 5));

        }

        long t1 = System.nanoTime();
        System.out.println(" Time for unsorted " + (t1 - t0) / loop + " nanoseconds");

        long t2 = System.nanoTime();

        for (int i = 0; i < loop; i++) {

            Sorted.search_Sorted(sortedArray1, rnd.nextInt(length * 5));
        }

        long t3 = System.nanoTime();
        System.out.println(" Time for sorted " + (t3 - t2) / loop + " nanoseconds");

        long t4 = System.nanoTime();
        for (int i = 0; i < loop; i++) {

            Binary_Search.binary_search(sortedArray1, rnd.nextInt(length * 5));
        }
        long t5 = System.nanoTime();

        System.out.println(" Time for binary " + (t5 - t4) / loop + " nanoseconds");
*/
        long t6 = System.nanoTime();
        for (int i = 0; i < loop; i++) {

            Better.better(sortedArray1, sortedArray2);
        }
        long t7 = System.nanoTime();
        System.out.println(" Time for better while " + (t7 - t6) / loop + " nanoseconds");


       /* long t8 = System.nanoTime();
        for (int i = 0; i < loop; i++) {


            Test.test1(sortedArray1, sortedArray2);
        }
        long t9 = System.nanoTime();
        System.out.println(" Time for better for " + (t9 - t8) / loop + " nanoseconds");*/

        long t10 = System.nanoTime();
        for (int i = 0; i < loop; i++) {

            Binary_duplicates.binary_search_duplicate(sortedArray1, sortedArray2);
        }
        long t11 = System.nanoTime();
        System.out.println(" Time for binary duplicates " + (t11 - t10) / loop + " nanoseconds");


    }

}
