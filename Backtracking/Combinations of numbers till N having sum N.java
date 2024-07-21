import java.util.*;
import java.util.stream.Collectors;
 
class Main
{
    public static void printCombinations(int i, int n, int[] out, int index)
    {
        if (n == 0)
        {
            System.out.println(Arrays.stream(out).limit(index)
                    .boxed().collect(Collectors.toList()));
        }
        for (int j = i; j <= n; j++)
        {
            out[index] = j;
            printCombinations(j, n - j, out, index + 1);
        }
    }
 
    public static void main(String[] args)
    {
        int n = 5;
        int[] out = new int[n];
        printCombinations(1, n, out, 0);
    }
}
