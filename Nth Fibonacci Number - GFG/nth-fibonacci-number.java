//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int helper(int n,int[] cache){
        if(cache[n]!=-1) return cache[n];
        
        if(n==0) return 0;
        if(n<=2) return 1;
        
        
        int fib=helper(n-1,cache)+helper(n-2,cache);
        
        cache[n]=fib%1000000007;
        
        return cache[n];
    }
    static int nthFibonacci(int n){
        // code here
        int[] cache=new int[n+1];
        
        Arrays.fill(cache,-1);
        
        return helper(n,cache);
       
    }
}