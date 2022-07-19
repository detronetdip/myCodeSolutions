/**
 * @param {number[]} nums
 * @return {number[]}
 */
 var buildArray = function(nums) {
    if(nums.length==0){
            return nums;
        }
        let res=[];
        
        for(let i=0;i<nums.length;i++){
            res.push(nums[nums[i]]);
        }
        return res;
};