import java.util.*;
class duplicate
{
    public static boolean[] map = new boolean[26];
    public static void removedup(String str,int idx , String newstring)
    {
        if(idx == str.length()) 
        {
            System.out.println(newstring);
            return;
        }   
        
        
       char curchar = str.charAt(idx);
       
       if(map[curchar - 'a'] == true)
       {
           removedup( str, idx+1 , newstring);
       }
       else
       {
           newstring += curchar;
           map[curchar - 'a'] = true;
           removedup( str, idx+1 , newstring);
       }
    }
    
    public static void main(String args[])
    {
        String str = "aabbccdda";
        String newstring = "";
        
        removedup( str, 0 , newstring);
    }
}
