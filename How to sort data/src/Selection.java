public class Selection {

    public static void selection(int[] array ) {

        // array {5,3,4,7,6,1}, {1,3,4,5,6,7}
        for (int i = 0; i < array.length - 1; i++) {
            // let's set the first candidate to the index itself
            int cand = i;
            for (int j = i + 1; j < array.length; j++) {
                // If the element at position j is smaller than the value
                // at the candidate position - then you have a new candidate
                // posistion.
                if (array[j] < array[cand]) {
                    cand = j;
                }
            }
            // Swap the item at position i with the item at the candidate position.
            int swap = array[cand];
            array[cand] = array[i];
            array[i] = swap;
        }

    }


}

