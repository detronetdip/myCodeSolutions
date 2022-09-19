class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int a=items1.length;
        int b=items2.length;
        for(int i=0;i<a;i++){
            if(!map.containsKey(items1[i][0])){
                map.put(items1[i][0],items1[i][1]);
            }else{
                map.put(items1[i][0],map.get(items1[i][0])+items1[i][1]);
            }
        }
        for(int i=0;i<b;i++){
            if(!map.containsKey(items2[i][0])){
                map.put(items2[i][0],items2[i][1]);
            }else{
                map.put(items2[i][0],map.get(items2[i][0])+items2[i][1]);
            }
        }
        // System.out.println(map);
        List<List<Integer>> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            List<Integer> l=new ArrayList<>();
            l.add(entry.getKey());
            l.add(entry.getValue());
            list.add(l);
        }
        return list;
    }
}