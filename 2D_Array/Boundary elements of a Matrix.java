import java.io.*;
public class Boundary{
 
    public static void printBoundary(int a[][], int m,
                                     int n)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0)
                    System.out.print(a[i][j] + " ");
                else if (i == m - 1)
                    System.out.print(a[i][j] + " ");
                else if (j == 0)
                    System.out.print(a[i][j] + " ");
                else if (j == n - 1)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 } };

        printBoundary(a, 4, 4);
    }
}
