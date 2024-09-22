import java.util.*;
class array
{
    public static int n = 0;
    public static void moveallx( String str, int idx ,String newstring)
    {
        if(idx == str.length())
        {
            for(int i = 0;i < n;i++)
            {
                newstring += 'x';
            }
            System.out.println(newstring);
            return;
        }
        
        char curchar = str.charAt(idx);
        
        if( curchar == 'x')
        {
          n++;
          moveallx(str,idx+1,newstring);
        }
        
        else
        {
            newstring += curchar;
            moveallx(str,idx+1,newstring);
        }
    }
    
    public static void main(String args[])
    {
        String str1 = "";
        String str = "axbxcxxdx";
        moveallx(str,0,str1);
    }
}
