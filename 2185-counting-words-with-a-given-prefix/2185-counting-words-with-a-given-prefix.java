class Solution {
    public int prefixCount(String[] words, String pref) {
        int length=pref.length();
        int count=0;
        for(String s:words){
            if(s.length()>=length && s.substring(0,length).equals(pref)){
                count++;
            }
        }
        return count;
    }
}