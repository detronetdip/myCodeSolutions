/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
 var searchInsert = function(nums: number[], target: number): number {
    var start = 0;
    var end = nums.length-1;
    while(start<=end){
        let mid=parseInt(`${(start+end)/2}`);
        if(nums[mid]==target){
            return mid;
        }else
         if(target<nums[mid]) {
            end=mid-1;
        }
        else if (target>nums[mid]) {
            start=mid+1;
        }
    }
    return start;
};