class Solution {
    public static int sum(int n){
        int s=0;
        while(n!=0){
            s+=(n%10);
            n/=10;
        }
        return s;
    }
    public int maximumSum(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int s=sum(nums[i]);
            if(map.get(s)!=null){
                max=Math.max((nums[i]+nums[map.get(s)]),max);
                if(nums[i]>nums[map.get(s)]){
                    map.put(s,i);
                }
            }else{
                map.put(s,i);
            }
        }
        return max==Integer.MIN_VALUE?-1:max;
    }
}