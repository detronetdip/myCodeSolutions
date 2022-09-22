class Solution {
    public String reverseWords(String s) {
        char[] ch=s.toCharArray();
        String ans="";
        String tmp="";
        for(char c:ch){
            if(c==' '){
                ans+=tmp+" ";
                tmp="";
            }else{
                tmp=c+tmp;
            }            
        }
        ans+=tmp;
        return ans;
    }
}