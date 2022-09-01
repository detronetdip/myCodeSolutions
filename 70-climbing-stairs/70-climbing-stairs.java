class Solution {
    static HashMap<Integer,Integer> map=new HashMap<>();
    public static int helper(int n){
         if (n <= 2) {
            return n;
        }
        if(map.get(n)!=null){
            return map.get(n);
        }else{
            int last;
            int slast;
            if(map.get(n)!=null){
                return map.get(n);
            }else{
                last=helper(n - 1);
                slast=helper(n - 2);
                map.put(n-1, last);
                map.put(n-2, slast);
            }
            return last+slast;
            
        }
    }
    public int climbStairs(int n) {
        return helper(n);
    }
}