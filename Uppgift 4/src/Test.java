public class Test {

    public static void main(String[] args) {
        int[] aux = new int[4];
        int[] org = {6, 4, 3, 2, 1};
        insertion(org);
        for (int i = 0; i < org.length; i++) {
            System.out.println(org[i]);
        }
    }

    public static int[] insertion(int[] array) {
        int key;
        int j;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            for (j = i - 1; j >= 0 && array[j] > key; j--) {
                array[j + 1] = array[j]; // 1 -> 2
            }
            array[j + 1] = key;
        }
        return array;
    }
}
