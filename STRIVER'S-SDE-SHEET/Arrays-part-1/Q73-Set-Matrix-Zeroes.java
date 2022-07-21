class Solution {
    public void setZeroes(int[][] matrix) {
          if(matrix.length==0){
            return;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        Integer zero=null;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                   if(i==0){
                       zero=0;
                   }else{
                       matrix[0][j]=0;
                       matrix[i][0]=0;
                   }
                }
            }
        }
        
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i!=0){
                   if(matrix[0][j]==0 || matrix[i][0]==0){
                       matrix[i][j]=0;
                   }
                }else{
                    Integer z=new Integer(0);
                    if(z.equals(zero)){
                        matrix[i][j]=0;
                    }
                }
            }
        }
    }
}