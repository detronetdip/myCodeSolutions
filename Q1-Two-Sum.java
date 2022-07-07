class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(map.get(rem)!=null){
                res[0]=i;
                res[1]=map.get(rem);
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}