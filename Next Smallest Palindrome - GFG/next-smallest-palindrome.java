//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int num[] = new int[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(str[i]);
            }

            Vector<Integer> ans = new Solution().generateNextPalindrome(num, n);
            for (Integer x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    void generateNextPalindromeUtil(int num[], int n) {
        int mid = n / 2;

        // end of left side is always 'mid -1'
        int i = mid - 1;

        // Beginning of right side depends
        // if n is odd or even
        int j = (n % 2 == 0) ? mid : mid + 1;

        boolean leftsmaller = false;
        while (i >= 0 && num[i] == num[j]) {
            i--;
            j++;
        }
        if (i < 0 || num[i] < num[j]) {
            leftsmaller = true;
        }

        while (i >= 0) {
            num[j++] = num[i--];
        }

        if (leftsmaller) {
            int carry = 1;

            if (n % 2 == 1) {
                num[mid] += 1;
                carry = num[mid] / 10;
                num[mid] %= 10;
            }
            i = mid - 1;
            j = (n % 2 == 0 ? mid : mid + 1);

            while (i >= 0 && carry > 0) {
                num[i] = num[i] + carry;
                carry = num[i] / 10;
                num[i] %= 10;
                num[j] = num[i];
                i--;
                j++;
            }
        }
    }
    
    Vector<Integer> generateNextPalindrome(int num[], int n) {
        Vector<Integer> ans = new Vector<>();
        if (isAll9(num, n)) {
            ans.add(1);
            for (int i = 0; i < n - 1; i++) ans.add(0);
            ans.add(1);

        }

        else {
            generateNextPalindromeUtil(num, n);
            for (int i = 0; i < n; i++) {
                ans.add(num[i]);
            }
        }
        return ans;
    }

    boolean isAll9(int num[], int n) {
        for (int i = 0; i < n; i++)
            if (num[i] != 9) return false;
        return true;
    }
}