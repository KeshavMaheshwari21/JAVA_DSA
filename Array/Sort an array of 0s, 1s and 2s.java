// Java Program to sort an array of 0s, 1s and 2s

class Sort{
    // Function to sort the array of 0s, 1s and 2s
    public static void sort(int a[], int n)
    {
        int c0 = 0, c1 = 0, c2 = 0;

        // Counting number of 0s, 1s and 2s in the array
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                c0 += 1;
            }
            else if (a[i] == 1) {
                c1 += 1;
            }
            else {
                c2 += 1;
            }
        }

        int idx = 0;
        // Placeing all the 0s first
        for (int i = 0; i < c0; i++)
            a[idx++] = 0;

        // Then all placing the 1s
        for (int i = 0; i < c1; i++)
            a[idx++] = 1;

        // Then all placing the 2s
        for (int i = 0; i < c2; i++)
            a[idx++] = 2;
    }
    public static void main(String[] args)
    {
        // Input array containing only 0s , 1s & 2s
        int[] a = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = a.length;

        sort(a, n);

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
