public class CreateArray {

    public int[] mergeArray(int[] array1, int[] array2) {
        int[] tempArray = new int[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++) {
            tempArray[i] = array1[i];
            }
        for (int j = array1.length; j < array2.length; j++) {
            tempArray[j] = array2[j];
        }
        return tempArray;
    }
}
