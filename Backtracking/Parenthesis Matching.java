import java.util.*;
class Solution
{
    public static List<String> generateParenthesis(int n)
    {
        List<String> ans = new ArrayList<>();
        solve("", 0, 0, n, ans);
        return ans;
    }
    
    public static void solve(String cur, int open, int closed, int total, List<String> ans)
    {
        if(cur.length()==2*total)
        {
            ans.add(cur);
            return;
        }
        
        if(open<total)
        {
            solve(cur+"(",open+1, closed, total, ans);
        }
        
        if(closed<open)
        {
            solve(cur+")",open,closed+1, total, ans);
        }
    }
    
    public static void main(String args[])
    {
        int n = 2;
        System.out.print(generateParenthesis(n));
    }
}
