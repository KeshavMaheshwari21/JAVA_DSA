import java.util.*;

class Tiles
{
    public static int placetiles( int n, int m)
    {
        if(n == m )
        {
            return 2;
        }
        
        if( n < m )
        {
            return 1;
        }
        
        int verplace = placetiles(n-m,m);
        int horplace = placetiles(n-1,m);
        
        return verplace + horplace;
    }
    
    public static void main(String args[])
    {
        System.out.println(placetiles( 4 , 2 )); 
    }
}
