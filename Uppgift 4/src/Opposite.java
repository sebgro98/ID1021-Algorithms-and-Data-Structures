import java.util.Random;

public class Opposite {


    public static void main(String[] args){
        int n = 50;
        int[] not = sorted_Opposite(n);
        for(int i = 0; i < not.length; i++) {
            System.out.println(not[i]);
        }

    }
    static int[] sorted_Opposite(int n) {
        Random rnd = new Random();
        int[] array = new int[n];
        int nxt = 0;
        for (int i = array.length - 1; i > -1 ; i--) {
            nxt += rnd.nextInt(10) + 1;
            array[i] = nxt;
        }
        return array;
    }
}
