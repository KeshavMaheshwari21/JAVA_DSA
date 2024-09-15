import java.util.*;
class NCR{
  static int comb(int n, int r)
  {
     if(n<r){
       return 0;
     }
     if(r == 0){
         return 1;
     }
     if(r == 1){
         return n;
     }
     if(n == 1){
         return 1;
     }
     return comb(n-1,r-1)+comb(n-1,r);
  }
 
  public static void main(String[] args)
  {
    int n = 5, r = 3;
 
    System.out.println(comb(n, r));
  }
}
