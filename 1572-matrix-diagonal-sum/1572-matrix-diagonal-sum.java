class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int l=mat.length;
        int p1=0,p2=l-1;
        for(int i=0;i<l;i++){
            if(p1!=p2){
                sum+=mat[i][p1]+mat[i][p2];
            }else{
                sum+=mat[i][p1];
            }
            p1++;
            p2--;
        }
        return sum;
    }
}