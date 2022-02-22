import java.util.*;

public class Fibonasi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0, y = 1, z, i = 2, n;
        System.out.println("Enter number of terms you want to display: ");
        n = s.nextInt();
        while (i < n) {
            System.out.println(x + " ");
            z = x + y;
            x = y;
            y = z;
            i++;
        }
    }
}