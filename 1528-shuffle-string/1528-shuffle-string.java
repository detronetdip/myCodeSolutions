class Solution {
    public String restoreString(String s, int[] indices) {
        int l=s.length();
        char[] ans=new char[l];
        
        for(int i=0;i<l;i++){
            ans[indices[i]]=s.charAt(i);
        }
        
        return new String(ans);
        
    }
}