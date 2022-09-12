class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i+=2){
            int freq=nums[i];
            int val=nums[i+1];
            while(freq!=0){
                list.add(val);
                freq--;
            }
        }
        int nn=list.size();
        int[] ans=new int[nn];
        for(int i=0;i<nn;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}