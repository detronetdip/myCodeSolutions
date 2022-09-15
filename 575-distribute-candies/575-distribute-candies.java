class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=candyType.length;
        for(int i=0;i<l;i++){
            if(!map.containsKey(candyType[i])){
                map.put(candyType[i],1);
            }else{
                map.put(candyType[i],map.get(candyType[i])+1);
            }
        }
        return map.size()<=(l/2)?map.size():l/2;
    }
}