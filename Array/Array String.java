import java.util.*;

class number{
    public static void main(String args[]) {
        String[] arr = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println("Elements in the in array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

OUTPUT:

Enter the name in array:
keshav
manvik
vinayak
eklavya
gaurang
Elements in the in array:
keshav
manvik
vinayak
eklavya
gaurang