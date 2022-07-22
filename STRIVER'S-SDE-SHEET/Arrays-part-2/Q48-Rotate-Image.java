class Solution {
    public static void swap(int[][] matrix,int i,int j){
        int t=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=t;
    }
    public static void reverse(int[] row){
        int i=0;
        int j=row.length-1;
        while(i<j){
             int t=row[i];
             row[i]=row[j];
             row[j]=t;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
       for(int i=0;i<n;i++){
           for(int j=0;j<i;j++){
               swap(matrix,i,j);
           }
       }
        for(int i=0;i<n;i++){
          reverse(matrix[i]);
       }
    }
}