class Solution {
    public int largestAltitude(int[] gain) {
        int max=Integer.MIN_VALUE;
        int cur=0;
        for(int alt: gain){
            int p=cur+alt;
            max=Math.max(max,Math.max(p,cur));
            cur=p;
        }
        return max;
    }
}