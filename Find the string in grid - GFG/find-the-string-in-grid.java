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
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            int[][] ans = obj.searchWord(grid, word);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            if(ans.length==0)
            {
                System.out.println("-1");
            }

        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {
        // Code here
        int m=grid.length;
        int n=grid[0].length;
        int wl = word.length();
        List<int[]> list=new ArrayList<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==word.charAt(0)){
                    int a=i,b=j,k=0;
                    boolean is=false;
                    
                    while(a>=0 && a<m && b>=0 && b<n && k<wl && grid[a][b]==word.charAt(k)){
                        b--;
                        k++;
                    }
                    if(k==wl){
                       is=true;
                    }
                    b=j;
                    k=0;
                    while(a>=0 && a<m && b>=0 && b<n && k<wl && grid[a][b]==word.charAt(k)){
                        b++;
                        k++;
                    }
                    if(k==wl){
                        is=true;
                    }
                    b=j;
                    k=0;
                    while(a>=0 && a<m && b>=0 && b<n && k<wl && grid[a][b]==word.charAt(k)){
                        a--;
                        k++;
                    }
                    if(k==wl){
                        is=true;
                    }
                    a=i;
                    k=0;
                    while(a>=0 && a<m && b>=0 && b<n && k<wl && grid[a][b]==word.charAt(k)){
                        a++;
                        k++;
                    }
                    if(k==wl){
                        is=true;
                    }
                    a=i;
                    k=0;
                    
                    while(a>=0 && a<m && b>=0 && b<n && k<wl && grid[a][b]==word.charAt(k)){
                        a--;
                        b++;
                        k++;
                    }
                    if(k==wl){
                        is=true;
                    }
                    a=i;
                    b=j;
                    k=0;
                    
                    while(a>=0 && a<m && b>=0 && b<n && k<wl && grid[a][b]==word.charAt(k)){
                        a--;
                        b--;
                        k++;
                    }
                    if(k==wl){
                        is=true;
                    }
                    a=i;
                    b=j;
                    k=0;
                    
                    while(a>=0 && a<m && b>=0 && b<n && k<wl && grid[a][b]==word.charAt(k)){
                        a++;
                        b++;
                        k++;
                    }
                    if(k==wl){
                        is=true;
                    }
                    a=i;
                    b=j;
                    k=0;
                    
                    while(a>=0 && a<m && b>=0 && b<n && k<wl && grid[a][b]==word.charAt(k)){
                        a++;
                        b--;
                        k++;
                    }
                    if(k==wl){
                        is=true;
                    }
                    a=i;
                    b=j;
                    k=0;
                    
                    if(is){
                        list.add(new int[]{i,j});
                    }
                }
            }
        }
        int[][] res=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);   
        }
        return res;
    }
}