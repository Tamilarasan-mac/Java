
import java.util.Arrays;

public class utility_copy{
    public static void main(String[] args) {
        int[] a = {10, 20, 30};

        int[] b = Arrays.copyOf(a,10);
        System.out.println(Arrays.toString(b));
    }
}