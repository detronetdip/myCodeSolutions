class Solution {
    public String firstPalindrome(String[] words) {
        for(String str:words){
        boolean flag=false;
            int i=0,j=str.length()-1;
            while(i<=j){
                if(str.charAt(i)!=str.charAt(j)){
                    flag=true;
                }
                i++;
                j--;
            }
            if(flag==false) return str;
        }
        return "";
    }
}