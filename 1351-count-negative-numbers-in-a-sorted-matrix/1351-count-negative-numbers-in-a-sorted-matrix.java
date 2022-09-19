class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=m-1;i>=0;i--){
            if(grid[i][0]<0){
                 count+=n;
            }else{
                int j=0;
                while(j<n && grid[i][j]>=0){
                    j++;
                }
                count+=(n-j);
            }
        }
        return count;
    }
}