import java.util.Scanner;

public class Mirror_Inverse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int flag = 0;
        try {
            System.out.println("Enter the size of an array: ");
            int n = s.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter the elements is an array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }

            System.out.println("Elements is an array is: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[arr[i]] != i) {
                    flag = 1;
                    break;
                }

                flag = 0;
            }

            if (flag == 0) {
                System.out.println("Given array is Mirror Inverse!!");
            } else {
                System.out.println("Given array is not a Mirror Inverse!!");
            }
        } catch (Exception e) {
            System.out.println("Given array is not a Mirror Inverse");
        }
    }
}