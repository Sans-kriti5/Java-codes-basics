import java.util.*;

class Matrix {
    private int[][] mat;

    public void setMatrix(int[][] mat) {
        this.mat = mat;
    }

    public int getDiagonalSum() {
        int diagSum = 0;
        for (int i = 0; i < 3; i++)
        {
            diagSum += mat[i][i]; // only main diagonal
        }
        return (diagSum);
    }
}

public class Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for 3x3 matrix:");

        int[][] mat = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        Matrix m = new Matrix();
        m.setMatrix(mat);
        int res = m.getDiagonalSum();
        System.out.println("Sum of diagonal elements is: " + res);
    }
}

// The above code is a Java program that checks if a 3x3 matrix is balanced based on the sum of its diagonal elements.
// The program defines a Matrix class with methods to set the matrix and calculate the diagonal sum.