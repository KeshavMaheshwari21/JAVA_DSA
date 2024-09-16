import java.util.*;
class Fibonnaci_series
{
    public static void fibonnaci(int a,int b,int n)
    {
        if (n==0)
        {
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibonnaci(b,c,n-1); 
    }
    public static void main(String args[])
    {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        fibonnaci(a,b,n-2);
    }
}
