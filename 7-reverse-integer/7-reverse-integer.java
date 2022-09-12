class Solution {
    public int reverse(int x) {
        int r=0;
        int f=x;
        while(x!=0){
            int e=r*10+(x%10);
            if((e-(x%10))/10 != r) return 0;
            r=e;
            x/=10;
        }
        return r;
    }
}