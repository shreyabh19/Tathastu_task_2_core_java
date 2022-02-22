import java.util.Scanner;

class Diamond {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of row");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (i > j)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > j)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}