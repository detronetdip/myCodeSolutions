class Solution {

    public int[] createTargetArray(int[] nums, int[] index) {
        int l=index.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<l;i++){
            list.add(index[i],nums[i]);
            
        }
        int a=list.size();
        int[] ans=new int[a];
        for(int i=0;i<a;i++){
            ans[i]=list.get(i);   
        }
        return ans;
    }
}