function maxSubArray(nums: number[]): number {
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