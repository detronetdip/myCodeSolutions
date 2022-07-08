class Solution {
    public boolean isPalindrome(int x) {
       if(x<0){
           return false;
       }
       int n=x,t=0;
       while(x!=0){
           int y=x%10;
           x/=10;
           t=t*10+y;
       }
       if(n==t){
           return true;
       }else{
           return false;
       }
    }
}