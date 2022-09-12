class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i+=2){
            int freq=nums[i];
            int val=nums[i+1];
            s+=freq;
            while(freq!=0){
                list.add(val);
                freq--;
            }
        }
        int[] ans=new int[s];
        for(int i=0;i<s;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}