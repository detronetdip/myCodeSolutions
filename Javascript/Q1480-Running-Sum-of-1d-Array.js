/**
 * @param {number[]} nums
 * @return {number[]}
 */
 var runningSum = function(nums) {
    if(nums.length==0){
            return nums;
        }
        let res=new Array(nums.length);
        let sum=0;
        for(let i=0;i<nums.length;i++){
            sum+=nums[i];
            res[i]=sum;
        }
        return res;
};