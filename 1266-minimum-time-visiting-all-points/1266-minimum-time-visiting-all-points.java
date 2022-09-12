class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans=0;
        int length=points.length;
        
        for(int i=0;i<length;i++){
            if(i==length-1) break;
            ans+=Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
        }
        
        return ans;
    }
}