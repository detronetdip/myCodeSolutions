class Solution {
    public int removeDuplicates(int[] nums) {
        int p=-1;
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
                nums[++p]=nums[i];
            }
        }
        return p+1;
    }
}