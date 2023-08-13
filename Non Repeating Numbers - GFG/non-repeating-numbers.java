//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code 
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.get(i)!=null){
                map.put(i,map.get(i)+1);
                continue;
            }else{
                map.put(i,1);
            }
        }
        
        for(Integer k:map.keySet()){
            int e=map.get(k);
            if(e==1){
                //  System.out.println(k+" "+res[0]);
                if(res[0]==0){
                    res[0]=k;
                }else if(res[0]>k){
                    res[1]=res[0];
                    res[0]=k;
                }else{
                    res[1]=k;
                }
            }
        }
       
        return res;
    }
}