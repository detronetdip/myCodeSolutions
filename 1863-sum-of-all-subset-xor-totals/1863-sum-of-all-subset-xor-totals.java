class Solution {
    private static void helper(int ind,List<List<Integer>> ans,ArrayList<Integer> ds,int[] arr){
        if(ind==arr.length){
            if(ds.size()>0) ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[ind]);
        helper(ind+1,ans,ds,arr);
        ds.remove(ds.size()-1);
        helper(ind+1,ans,ds,arr);
    }
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        helper(0,ans,ds,nums);
        int sum=0;
        for(int i=0;i<ans.size();i++){
            int x=0;
            for(int j=0;j<ans.get(i).size();j++){
                x^=ans.get(i).get(j);
            }
            sum+=x;
        }
        return sum;
    }
}