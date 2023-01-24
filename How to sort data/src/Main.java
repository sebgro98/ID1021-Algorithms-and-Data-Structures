public class Main {

    public static void main(String[] args) {
        int loop = 10_0000;
        int n = 100;
        long t_total = 0;
        int[] array1 = Opposite.sorted_Opposite(n);
        Selection.selection(array1);

        System.out.println("Selection sort");
        for (int j = 0; j < 1; j++) {

            for (int i = 0; i < loop; i++) {
                int[] array = Generate_array.generate_array(n);
                long t0 = System.nanoTime();
                Selection.selection(array);
                t_total += (System.nanoTime() - t0);
            }

            System.out.println(" n = " + n + " time = " + t_total / loop + " nanoseconds");
            n = n * 2;
        }

        n = 100;
        t_total = 0;
        System.out.println("Insertion sort");
        for (int j = 0; j < 1; j++) {
            for (int i = 0; i < loop; i++) {
                int[] array = Generate_array.generate_array(n);
                long t0 = System.nanoTime();
                Insertion.insertion(array);
                t_total += (System.nanoTime() - t0);

            }
            System.out.println(" n = " + n + " time = " + t_total / loop + " nanoseconds");
            n = n * 2;
        }

        n = 100;
        t_total = 0;
        System.out.println("Merge sort old");
        for (int j = 0; j < 5; j++) {

            for (int i = 0; i < loop; i++) {
                int[] array = Generate_array.generate_array(n);
                long t0 = System.nanoTime();
                MergeSort.sort(array);
                t_total += (System.nanoTime() - t0);
            }

            System.out.println(" n = " + n + " time = " + t_total / loop + " nanoseconds");
            n = n * 2;

        }

        n = 100;
        t_total = 0;
        System.out.println("Merge sort new");
        for (int j = 0; j < 1; j++) {


            for (int i = 0; i < loop; i++) {
                int[] array = Generate_array.generate_array(n);
                long t0 = System.nanoTime();
                new_merge.sort(array,0,array.length - 1);
                t_total += (System.nanoTime() - t0);
            }

            System.out.println(" n = " + n + " time = " + t_total / loop + " nanoseconds");
            n = n * 2;

        }
    }
}
