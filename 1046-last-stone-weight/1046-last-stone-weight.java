class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
        for(int i:stones){
            pq.offer(i);
        }
        while(!pq.isEmpty()){
            if(pq.size()==1){
                return pq.poll();
            }else{
                int a=pq.poll();
                int b=pq.poll();
                int s=Math.abs(a-b);
                if(s!=0) pq.offer(s);
            }
            
        }
        return 0;
    }
}