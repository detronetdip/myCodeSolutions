class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int[] i:grid){
            for(int j:i){
                if(j<0) count++;
            }
        }
        return count;
    }
}