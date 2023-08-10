//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int helper(String s1,String s2, int r1, int r2,int[][] dp){
        
        if(r1==-1 || r2==-1) return 0;
        
        if(dp[r1][r2]!=-1)return dp[r1][r2];
        
        if(s1.charAt(r1)==s2.charAt(r2)){
            dp[r1][r2]= 1+helper(s1,s2,r1-1,r2-1,dp);
            return dp[r1][r2];
        }else{
            dp[r1][r2]= Math.max(helper(s1,s2,r1-1,r2,dp),helper(s1,s2,r1,r2-1,dp));
            return dp[r1][r2];
        }
        
    }
    
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int[][] dp=new int[x][y];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return helper(s1,s2,x-1,y-1,dp);
    }
    
}