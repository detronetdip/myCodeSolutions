class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        int l=candyType.length;
        int s=0;
        for(int i=0;i<l;i++){
            if(set.add(candyType[i])){
                s++;
            }
        }
        return s<=(l/2)?s:l/2;
    }
}