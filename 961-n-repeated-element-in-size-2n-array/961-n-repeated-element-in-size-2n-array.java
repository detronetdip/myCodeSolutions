class Solution {
    public int repeatedNTimes(int[] nums) {
        int l=nums.length;
        int[] tmp=new int[l+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.get(i)!=null){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==l/2) return entry.getKey();
        }
        return 0;
    }
}