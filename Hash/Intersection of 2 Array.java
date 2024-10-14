import java.util.*;

public class Classroom {
    public static void intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        
        // Add all elements of arr1 to set
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        
        // Add all elements of arr2 to set1
        for (int i = 0; i < arr2.length; i++) {
            set1.add(arr2[i]);
        }
        
        // Iterate through set1 and print the elements that are in set
        for (Integer num : set1) {
            if (set.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        intersection(arr1, arr2);
    }
}
