class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ans=new int[m][n];
        int l=original.length;
        
        if(l!=(m*n)) return new int[0][0];
        for(int i=0;i<l;i++){
                ans[i/n][i%n]=original[i];
        }
        return ans;
    }
}