class Solution {
    private static void incrementRow(int[][] matrix,int length,int rowNo){
        for(int i=0;i<length;i++){
            ++matrix[rowNo][i];
        }
    }
    private static void incrementColumn(int[][] matrix,int length,int colNo){
        for(int i=0;i<length;i++){
            ++matrix[i][colNo];
        }
    }
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix=new int[m][n];
        for(int[] set: indices){
            incrementRow(matrix,n,set[0]);
            incrementColumn(matrix,m,set[1]);
        }
        int count=0;
        for(int[] row:matrix){
            for(int ele:row){
                if(ele%2!=0) count++;
            }
        }
        return count;
    }
}