import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i, fact = 1;
        System.out.println("Enter any number: ");
        n = s.nextInt();
        if (n < 0) {
            System.out.println("No factorial of negative number!!");
        } else {
            for (i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("The factorial of " + n + " is " + fact);
        }
    }

}
