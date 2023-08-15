//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maxOnes(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    static int maximumSum(int[] a){
        int max=a[0];
        int cur=a[0];
        
        for(int i=1;i<a.length;i++){
            cur=Math.max(a[i],cur+a[i]);
            max=Math.max(cur,max);
        }
        return Math.max(max,0);
    }

    public static int maxOnes(int a[], int n) {
        // Your code goes here
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                a[i]=1;
            }else{
                a[i]=-1;
                count++;
            }
        }
        return count+maximumSum(a);
    }
}
