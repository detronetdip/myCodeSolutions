class Solution {
    private static boolean checkRange(int[] arr,int start,int end){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>= start && arr[m]<=end){
                return false;
            }else if(arr[m]<start){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return true;
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        int m=arr1.length;
        Arrays.sort(arr2);
        for(int i=0;i<m;i++){
            if(checkRange(arr2,arr1[i]-d,arr1[i]+d)) ans++;            
        }
        return ans;
    }
}