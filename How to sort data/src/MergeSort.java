public class MergeSort {

    public static void main(String[] args){
        int[] org = {2,5,7,1,654,2,1,2,5,7,9,897,453,32321,13,0};
        sort(org);
        for(int i = 0; i < org.length; i++) {
            System.out.println(org[i]);
        }

    }

    public static void sort(int[] org) {
        if (org.length == 0)
            return;
        int[] aux = new int[org.length];
        sort(org, aux, 0, org.length - 1);
    }

    private static void sort(int[] org, int[] aux, int lo, int hi) {
        if (lo != hi) {
            int mid = lo + (hi - lo) / 2;
    // sort the items from lo to mid
            sort(org, aux, lo, mid);
    // sort the items from mid+1 to hi
            sort(org, aux, mid+1, hi);
    // merge the two sections using the additional array
            merge(org, aux, lo, mid, hi);
        }
    }

    private static void merge(int[] org, int[] aux, int lo, int mid, int hi) {
    // copy all items from lo to hi from org to aux
        for (int i = 0; i < aux.length; i++) {
            aux[i] = org[i];
        }
    // let's do the merging

        int i = lo; // the index in the first part
        int j = mid + 1; // the index in the second part

    // for all indeces from lo to hi
        for (int k = lo; k <= hi; k++) {

    // if i is greater than mid, move the j item to the org array, update j
            if (i  > mid) {
                org[k] = aux[j++];

            }
    // else if j is greater than hi, move the i item to the org array, update i
            else if (j > hi) {
                org[k] = aux[i++];

            }
    // else if the i item is smaller than the j item,
    // move it to the org array, update i
            else if ( aux[i] <= aux[j]) {
                org[k] = aux[i++];

            }
    // else you can move the j item to the org array, update j
            else {
                org[k] = aux[j++];
            }
        }
    }

}
