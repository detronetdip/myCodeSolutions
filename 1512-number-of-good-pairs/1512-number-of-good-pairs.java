class Solution {
    private static int getPair(int n){        
        return (n*(n-1))/2;
    }
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int pair=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=null){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int k=entry.getKey() ;
            int v= entry.getValue();
            if(v>1){
                int a=getPair(v);                
                pair=pair+a;
            }
        }
        return pair;
    }
}