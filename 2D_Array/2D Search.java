import java.util.*;

class Array {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        int[][] arr = new int[3][3];
        System.out.println("Enter the numbers in the array:");
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Enter the numbers to search:");
        n = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<3;j++){
                if(arr[i][j] == n){
                    System.out.println("( "+i+" , "+j+" )");
                }
            }
        }
    }
}