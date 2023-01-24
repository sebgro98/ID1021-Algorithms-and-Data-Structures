import java.util.Arrays;

public class Insertion {
    // array //{1,6,5,4,3,2}, {1,3,4,5,6,7}
       public static int[] insertion(int[] array){
           int key;
           int j;
           for (int i = 1; i < array.length; i++) {
               key = array[i];
               for ( j = i-1; j >= 0 && array[j] > key; j--) {
                   array[j+1] = array[j]; // 1 -> 2
               }
               array[j+1] = key;
           }
           return array;
       }

    public static void sort(int array[]) {
        for (int j = 1; j < array.length; j++) {
            int current = array[j];
            int i = j-1;
            while ((i > -1) && (array[i] > current)) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = current;
        }
    }

    public static void test(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] < array[j-1] ; j--) {
                int placeHolder = array[j-1];
                array[j-1] = array[j];
                array[j] = placeHolder;
            }
        }
    }
}
