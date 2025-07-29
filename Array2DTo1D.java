import java.util.Arrays;
import java.util.Scanner;

public class Array2DTo1D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the 2D array: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns for the 2D array: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements for the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nOriginal 2D Array (Matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int[] singleDimArray = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                singleDimArray[index] = matrix[i][j];
                index++;
            }
        }

        System.out.println("\nCopied 1D Array:");
        System.out.println(Arrays.toString(singleDimArray));

        scanner.close();
    }
}