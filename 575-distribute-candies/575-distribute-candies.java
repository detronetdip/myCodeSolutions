class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=candyType.length;
        int s=0;
        for(int i=0;i<l;i++){
            if(!map.containsKey(candyType[i])){
                map.put(candyType[i],1);
                s++;
            }else{
                map.put(candyType[i],map.get(candyType[i])+1);
            }
        }
        return s<=(l/2)?s:l/2;
    }
}