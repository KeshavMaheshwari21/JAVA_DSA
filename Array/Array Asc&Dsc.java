import java.util.*;

class Ascending {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ascending = 1;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                ascending = 0;
                break;
            }
        }

        if (ascending == 1) {
            System.out.println("The Array is in Ascending Order!!!");
        }
        else {
            System.out.println("The Array is not in Ascending Order!!!");
        }
    }
}
