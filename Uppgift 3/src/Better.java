import java.util.Arrays;

public class Better {

    public static void better(int[] sorted1, int[] sorted2) {
        int i = 0;
        int j = 0;
        while (i < sorted1.length && j < sorted2.length ) {

            if (sorted1[i] > sorted2[j]){
                j++;
            }
            else if (sorted1[i] == sorted2[j]) {
                i++;
                j++;
            }
            else if (sorted1[i] < sorted2[j]){
                i++;
            }


        }
    }
}





