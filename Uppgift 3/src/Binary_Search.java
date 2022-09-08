public class Binary_Search {

    public static boolean binary_search (int[] array, int key ) {
        int min = 0;
        int max = array.length - 1;

        while (true) {
            int mid = min + ((max - min)/2);
            if (array[mid] == key) {
                return true;
            }
            if ((array[mid] < key && mid < max)) {
                min = mid + 1;
                continue;
            }
            if ((array[mid] > key && mid > min)) {
                max = mid - 1;
                continue;
            }
            break;
        }
        return false;
    }
}
