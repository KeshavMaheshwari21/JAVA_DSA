import java.util.*;

class spiral {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row, col;

        // Asking for the no. of Rows & Column in 2d array
        System.out.print("Enter the rows:");
        row = sc.nextInt();
        System.out.print("Enter the column:");
        col = sc.nextInt();

        // Declaration of the 2D Array
        int[][] arr = new int[row][col];

        System.out.println("Enter the number in 2D Array:");

        // Asking for the i/p in 2d Array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array is :");

        // Printing the 2D Array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int row_begin = 0;
        int col_begin = 0;
        int row_end = row - 1;
        int col_end = col - 1;

        while (row_begin <= row_end && col_begin <= col_end) {

            // Traverse Right
            for (int j = col_begin; j <= col_end; j++) {
                System.out.print(arr[row_begin][j] + " ");
            }
            row_begin++;

            // Traverse Down
            for (int j = row_begin; j <= row_end; j++) {
                System.out.print(arr[j][col_end] + " ");
            }
            col_end--;

            // Traverse Left
            if (row_begin <= row_end) {
                for (int j = col_end; j >= col_begin; j--) {
                    System.out.print(arr[row_end][j] + " ");
                }
            }
            row_end--;

            // Traverse Up
            if (col_begin <= col_end) {
                for (int j = row_end; j >= row_begin; j--) {
                    System.out.print(arr[j][col_begin] + " ");
                }
            }
            col_begin++;
        }
    }
}
