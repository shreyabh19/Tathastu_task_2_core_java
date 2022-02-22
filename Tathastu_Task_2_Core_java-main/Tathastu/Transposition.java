import java.util.*;

public class Transposition {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int row, col;
        System.out.print("Enter Dimention of the Matrix: ");
        row = s.nextInt();
        col = s.nextInt();
        int A[][] = new int[row][col];
        int C[][] = new int[row][col];

        System.out.println("Enter " + row + " x " + col + " Element for a matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = s.nextInt();
            }
        }
        System.out.println("Elements in the Matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The Transpose of Matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                C[i][j] = A[j][i];
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
