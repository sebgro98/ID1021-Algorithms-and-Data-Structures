import java.util.Random;
public class Generate_array {

    public static int[] generate_array(int length) {
        Random rnd = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = rnd.nextInt(length * 5);
        }
        return arr;
    }
}
