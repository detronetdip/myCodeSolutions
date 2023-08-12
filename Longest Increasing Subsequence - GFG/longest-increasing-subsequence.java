//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    
    static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
 
        for (int i = 1; i < n; i++) {
            if (nums[i] > ans.get(ans.size() - 1)) {
                ans.add(nums[i]);
            } else {
                int low = Collections.binarySearch(ans, nums[i]);
                if (low < 0) {
                    low = -(low + 1);
                }
                ans.set(low, nums[i]);
            }
        }
        return ans.size();
    }
    
    static int longestSubsequence(int n, int arr[])
    {
        // code here
        //   int dp[][] = new int[n + 1][n + 1];
        // for (int row[] : dp)
        //     Arrays.fill(row, -1);
 
        return lengthOfLIS(arr);
    }
} 