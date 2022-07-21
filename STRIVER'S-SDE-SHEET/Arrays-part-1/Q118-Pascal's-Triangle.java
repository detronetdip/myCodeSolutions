class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        for(int i=1;i<=numRows;i++){
            if(i==1){
                ArrayList<Integer> l=new ArrayList<>();
                l.add(1);
                list.add(l);
            }else{
                List<Integer> prev=list.get(list.size()-1);
                prev.add(0,0);
                prev.add(0);
                List<Integer> k=new ArrayList<>();
                for(int j=1;j<prev.size();j++){
                    k.add(prev.get(j)+prev.get(j-1));
                }
                prev.remove(0);
                prev.remove(prev.size()-1);
                list.add(k);
            }
        }
        return list;
    }
}