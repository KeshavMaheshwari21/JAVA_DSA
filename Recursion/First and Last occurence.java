import java.util.*;
class occurence
{
    public static int first = -1;
    public static int last = -1;
    public static void find( String str, int idx , char element)
    {
        if(idx == str.length()-1)
        {
            System.out.print("Element found at pos "+first+" and "+last);
            return;
        }
        char curchar = str.charAt(idx);
        if(curchar == element)
        {
            if(first == -1)
            {
                first = idx;
            }
            else
            {
                last = idx;
            }
        }
        find(str,idx+1,element);
    }
    
    public static void main(String args[])
    {
        String str = "abcdeab";
        find(str,0,'a');
    }
}
