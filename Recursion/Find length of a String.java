import java.util.*;
 
public class Length{
 
    private static int recLen(String str) 
    {
 
        if (str.equals(""))
            return 0;
        else
            return recLen(str.substring(1)) + 1;
    }
 
    public static void main(String[] args) 
    {
        String str ="KeshavMaheshwari";
        System.out.println(recLen(str));
    }
}
