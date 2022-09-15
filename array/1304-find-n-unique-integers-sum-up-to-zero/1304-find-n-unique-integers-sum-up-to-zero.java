class Solution {
    public int[] sumZero(int n) {
        int[] a=new int[n];
        if(n==1) {
            a[0]=0;
            return a;
        };
        int start=1;
       for(int i=0;i<n-1;i+=2){
           a[i]=start;
           a[i+1]=start*(-1);
           start++;
       }
        return a;
    }
}