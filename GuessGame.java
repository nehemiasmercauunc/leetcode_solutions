import java.util.Arrays;
import java.util.stream.*;

public class GuessGame {

    public static int guessNumber(int n) {
        
       // int[] arr = new int[n];
        int[] arr = IntStream.rangeClosed(1, n).toArray();
        System.out.println(Arrays.toString(arr));
        return 0;
    }

}
