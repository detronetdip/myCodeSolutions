class Solution {
    private static int gcd(int a,int b){
        if (b != 0)
            return gcd(b, a % b);
        else
            return a;
    } 
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0],nums[nums.length-1]);
    }
}