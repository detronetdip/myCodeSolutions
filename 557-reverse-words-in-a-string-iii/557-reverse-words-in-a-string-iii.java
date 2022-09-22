class Solution {
    public String reverseWords(String s) {
        char[] ch=s.toCharArray();
        String ans="";
        String tmp="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                ans+=tmp+" ";
                tmp="";
            }else{
                tmp=s.charAt(i)+tmp;
            }            
        }
        ans+=tmp;
        return ans;
    }
}