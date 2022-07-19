class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Integer first=null;
        Integer second=null;
        Integer third=null;
        for(Integer i:nums){
            if(i.equals(first) || i.equals(second) || i.equals(third)){
                continue;
            }
            if(first==null || i>first){
                third=second;
                second=first;
                first=i;
            }else if(second==null || i>second){
                 third=second;
                second=i;
            }else if(third==null || i>third){
                third=i;
            }
        }
        return third==null?first:third;
    }
}