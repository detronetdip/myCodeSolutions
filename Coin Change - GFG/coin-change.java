//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public static long helper(int[] coins,int index,int sum,long[][] cache){
        // System.out.println(index);
        if(index==0){
            return sum%coins[0]==0?1:0;
        }
        
        if(cache[index][sum]!=-1) return cache[index][sum];
        
        long notTake=helper(coins,index-1,sum,cache);
        
        long take=0;
        
        if(coins[index]<=sum) {
            take=helper(coins,index,sum-coins[index],cache);
        }
        
        cache[index][sum]=take+notTake;
        return cache[index][sum];
    }
    
    public long count(int coins[], int N, int sum) {
        long[][] cache=new long[N][sum+1];
        for(long[] r:cache){
            Arrays.fill(r,-1);
        }
        long r=helper(coins,N-1,sum,cache);
        return r;
    }
}