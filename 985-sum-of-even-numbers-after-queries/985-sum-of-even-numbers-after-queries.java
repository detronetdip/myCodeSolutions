class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int totalSum=0,l=nums.length;
        int[] ans=new int[l];
        for(int i:nums)
            if(i%2==0)
                totalSum+=i;
        for(int i=0;i<l;i++){
            int cur=nums[queries[i][1]];
            boolean wasEven=nums[queries[i][1]]%2==0?true:false;
            nums[queries[i][1]]+=queries[i][0];
            int after=nums[queries[i][1]];
            boolean isEven=nums[queries[i][1]]%2==0?true:false;
            if(isEven && wasEven){
                totalSum=cur>after?totalSum-cur+after:totalSum+after-cur;
            }else if(!wasEven && isEven){
                totalSum+=after;
            }else if(wasEven && !isEven){
                totalSum-=cur;
            }
            // System.out.println(totalSum+" "+wasEven+" "+isEven+" "+cur+" "+after);
            ans[i]=totalSum;
        }
        return ans;
    }
}