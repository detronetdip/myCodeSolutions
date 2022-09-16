class Solution {
    public int[] diStringMatch(String S) {
        int n = S.length();
        int[] ans = new int[n+1];
        int max = n, min = 0,pos=0;
        for(int i = 0; i < S.length();i++){
            if(S.charAt(i) == 'D') ans[pos++] = max--;
            else ans[pos++] = min++;
        }
        
        ans[pos] = min;  
        return ans;
    }
}