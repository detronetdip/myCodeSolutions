class Solution {
    public int[] numberOfPairs(int[] nums) {
        if(nums.length==0){
            int[] ar={0,0};
        }
        int pair=0;
        int left =0;
        HashMap<Integer,Integer> table=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(table.get(nums[i])!=null){
                int occur=table.get(nums[i]);
                occur++;
                pair+=occur/2;
                occur%=2;
                table.put(nums[i],occur);
            }else{
                table.put(nums[i],1);
            }
        }
         for (Map.Entry<Integer,Integer> entry : table.entrySet()) {
           left+=entry.getValue();
         }
        int[] ar={pair,left};
        return ar;
    }
}