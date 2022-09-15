class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int tl=nums1.length+nums2.length;
        int[] f=new int[tl];
        int i=0,j=0,k=0;
        while(true){
            if(i>=nums1.length || j>=nums2.length) break;
            
            if(nums1[i]<=nums2[j]){
                f[k]=nums1[i];
                i++;
                k++;
            }else{
              f[k]=nums2[j];
                j++;
                k++;  
            }
        }
            while(i<nums1.length){
                f[k]=nums1[i];
                i++;
                k++;
            }
        
        while(j<nums2.length){
                f[k]=nums2[j];
                j++;
                k++;
            }
        if(tl%2==0) {
            return (f[tl/2]+f[(tl/2)-1])/2.0;
        }
        
        return f[tl/2]*1.0 ;
    }
    
}