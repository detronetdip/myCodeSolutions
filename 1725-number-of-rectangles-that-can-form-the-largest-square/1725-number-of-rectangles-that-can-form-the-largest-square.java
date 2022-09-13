class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int[] rect:rectangles){
            int maxL=Math.min(rect[0],rect[1]);
            if(map.containsKey(maxL)){
                map.put(maxL,map.get(maxL)+1);
            }else{
                map.put(maxL,1);
            }
            max=Math.max(max,maxL);
        }
        return map.get(max);
    }
}