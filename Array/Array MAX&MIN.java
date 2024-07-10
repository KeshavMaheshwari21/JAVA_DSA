import java.util.*;
class number{
    public static void main(String args[])
    {
    int [] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers:");
    for(int i=0;i<5;i++)
    {
        arr[i]=sc.nextInt();
    }
    int max =0;
    for(int i=0;i<5;i++)
    {
      if(arr[i]>max){
          max = arr[i];
      }
    }
    System.out.println("Maximum number in array :"+max);
    int min = max;
    for(int i=0;i<5;i++)
    {
      if(arr[i]<min){
          min = arr[i];
      }
    }
        System.out.println("Minimum number in array :"+min);
    }
  }


OUTPUT:

Enter the numbers:
12
23
34
52
23
Maximum number in array :52
Minimum number in array :12