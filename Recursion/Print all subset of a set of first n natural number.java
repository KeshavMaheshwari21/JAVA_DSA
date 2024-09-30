import java.util.*;

class Tiles
{
    public static void printset(ArrayList<Integer> subset)
    {
        for(int i = 0 ; i< subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findset( int n , ArrayList<Integer> subset) 
    {
        if(n == 0 )
        {
            printset(subset);
            return;
        }
        
        subset.add(n);
        findset(n-1,subset);
        
        subset.remove(subset.size()-1);
        findset(n-1,subset);
    }
    
    public static void main(String args[])
    {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findset( n , subset );
    }
}
