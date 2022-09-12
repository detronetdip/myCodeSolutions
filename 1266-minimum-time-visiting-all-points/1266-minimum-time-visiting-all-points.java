class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
//         int ans=0;
//         int length=points.length;
        
//         for(int i=0;i<length;i++){
//             if(i==length-1) break;
//             int cX=points[i][0];
//             int cY=points[i][1];
//             int tX=points[i+1][0];
//             int tY=points[i+1][1];
//             int count=0;
//             while(cX!=tX || cY!=tY){
//                 if(cX<tX){
//                     cX++;
//                 }else if(cX>tX){
//                     cX--;
//                 }
//                 if(cY<tY){
//                     cY++;
//                 }else if(cY>tY){
//                     cY--;
//                 }
//                 count++;
//             }
//             if(cX<tX){
//                 cX++;
//                 count++;
//             }
//             if(cY<tY){
//                 cY++;
//                 count++;
//             }
//             ans+=count;
//         }
        
//         return ans;
        
        int ans=0;
        int length=points.length;
        
        for(int i=0;i<length;i++){
            if(i==length-1) break;
            ans+=Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
        }
        
        return ans;
    }
}