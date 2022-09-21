class Solution {
    public boolean isPalindrome(String s) {
        String f="";
        String g="";
        char[] ch=s.toLowerCase().toCharArray();
        for(int c:ch){
            if((c>=97 && c<=122) ||(c>=48 && c<=57)){
                f+=(char)c;
                g=(char)c+g;
            }
        }
        System.out.println(f+"   "+g);
        return g.equals(f);
    }
}