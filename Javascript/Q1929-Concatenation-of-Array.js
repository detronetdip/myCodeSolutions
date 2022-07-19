/**
 * @param {number[]} nums
 * @return {number[]}
 */
 var getConcatenation = function(nums) {
    if(nums.length==0){
            return nums;
        }
        let res=new Array(nums.length*2);
        for(let i=0;i<nums.length;i++){
            res[i]=nums[i];
            res[i+nums.length]=nums[i];
        }
        return res;
};