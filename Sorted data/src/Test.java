import java.util.Random;

public class Test  {
        public static void test1(int[] sorted1, int[] sorted2) {

        int count = 0;
        for (int i = 0; i < sorted1.length; i++) {
            for (int j = count; j < sorted2.length; j++) {

                if (sorted1[i] == sorted2[j]) {
                    count = j + 1;
                    break;
                } else if (sorted1[i] < sorted2[j]) {
                    count = j;
                    break;
                }
            }
        }
    }
}