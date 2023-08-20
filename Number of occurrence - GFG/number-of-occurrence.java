//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int i=0,j=n-1;
        
        while(i<=j){
            int mid=i+(j-i)/2;
            
            if(arr[mid]==x){
                
                int a=mid,b=mid;
                int count=0;
                
                while(a>=0 || b<n){
                    if(a>=0 && arr[a]==x && a<=b){
                        count++;
                    }
                    
                    if(b<n && arr[b]==x && b>a){
                        count++;
                    }
                    a--;
                    b++;
                }
                
                return count;
                
            }else if(x>arr[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        
        return 0;
    }
}