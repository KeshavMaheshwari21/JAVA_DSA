import java.util.*;
class subsequences
{
    public static void sub(String str , int idx , String newstring)
    {
        if(idx == str.length())
        {
            System.out.println(newstring);
            return;
        }
        char curchar = str.charAt(idx);
        sub(str, idx+1, newstring+curchar);
        sub(str, idx+1, newstring);        
    }
    public static void main(String args[])
    {
        String str= "abc";
        sub(str,0," ");
    }
}
