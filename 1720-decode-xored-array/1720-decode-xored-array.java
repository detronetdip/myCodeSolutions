class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] ans=new int[encoded.length+1];
        ans[0]=first;
        int e=encoded.length;
        for(int i=1;i<e+1;i++){
            ans[i]=ans[i-1]^encoded[i-1];
        }
        return ans;
    }
}