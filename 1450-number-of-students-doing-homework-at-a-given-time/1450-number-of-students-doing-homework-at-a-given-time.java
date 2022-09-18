class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        int l=startTime.length;
        for(int i=0;i<l;i++){
            if(queryTime>=startTime[i] && queryTime<=endTime[i]) count++;
        }
        return count;
    }
}