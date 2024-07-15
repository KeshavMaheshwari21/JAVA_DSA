import java.util.*;
 
public class Rotatecycle{
    
    static void rotate(int arr[])
    {
        int last_el = arr[arr.length - 1], i;
        for (i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = last_el;
    }
 
    public static void main(String[] args)
    {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        
        System.out.println("Given Array is");
        
        for(int i = 0; i < arr.length; i++ )
        System.out.print(arr[i]+" ");
 
        rotate(arr);
        System.out.println(); 
 
        System.out.println("Rotated Array is");
        
         for(int i = 0; i < arr.length; i++ )
        System.out.print(arr[i]+" ");
    }
}