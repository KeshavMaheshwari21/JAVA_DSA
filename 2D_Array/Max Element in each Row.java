public class GFG{
 
    // Function to get max element
    public static void maxelement(int no_of_rows, int[][] arr) {
        int i = 0;
         
        // Initialize max to 0 at beginning
        // of finding max element of each row
        int max = 0;
        int[] result = new int[no_of_rows];
        while (i < no_of_rows) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            result[i] = max;
            max =0;
            i++;
 
        }
        printArray(result);
 
    }
 
    // Print array element
    private static void printArray(int[] result) {
        for (int i =0; i<result.length;i++) {
            System.out.println(result[i]);
        }
 
    }
 
    // Driver code
    public static void main(String[] args) {
        int[][] arr = new int[][] { {3, 4, 1, 8},
                                    {1, 4, 9, 11},
                                    {76, 34, 21, 1},
                                   {2, 1, 4, 5} };
       // Calling the function  
        maxelement(4, arr);
    }
}
