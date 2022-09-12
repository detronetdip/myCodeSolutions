class Solution {
    public int[] decode(int[] encoded, int first) {
        int e=encoded.length;
        int[] ans=new int[e+1];
        ans[0]=first;
        for(int i=1;i<e+1;i++){
            ans[i]=ans[i-1]^encoded[i-1];
        }
        return ans;
    }
}