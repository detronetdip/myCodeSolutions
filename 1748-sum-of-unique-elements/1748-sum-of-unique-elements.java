class Solution {
    public int sumOfUnique(int[] nums) {
        int[] tmp=new int[100];
        int sum=0;
        for(int i:nums){
            if(tmp[i-1]==1)
                sum-=i;
            else if(tmp[i-1]==0)
                sum+=i;
            tmp[i-1]++;
        }
        return sum<0?0:sum;
    }
}