/**
 * @param {number[]} nums
 * @return {number}
 */
 var maxSubArray = function(nums) {
    var maxSum=-2147483648;
       var sum=0;
       for(var i of nums){
           sum+=i;
           maxSum=Math.max(maxSum,sum);
           if(sum<0){
               sum=0;
           }
       }
       return maxSum;
};