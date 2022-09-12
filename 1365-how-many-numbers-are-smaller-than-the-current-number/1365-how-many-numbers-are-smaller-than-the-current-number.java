class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int[] ans=new int[nums.length];
        int[] clone=nums.clone();
      HashMap<Integer,Integer> map=new HashMap<>();
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
           map.putIfAbsent(nums[i],i);
       }
       for(int i=0;i<clone.length;i++){
           ans[i]=map.get(clone[i]);
       }
        return ans;
    }
}