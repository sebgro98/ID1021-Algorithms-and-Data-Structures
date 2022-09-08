public class Binary_duplicates {

    public static void binary_search_duplicate (int[] array1, int[] array2 ) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            if (binary_Search(array1, array2[i])) {
                sum++;
            }
        }

        //return false;
    }
    public static boolean binary_Search (int[] array, int key) {

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

