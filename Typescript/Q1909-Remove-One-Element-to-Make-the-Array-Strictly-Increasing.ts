function canBeIncreasing(nums: number[]): boolean {
    if(nums.length==0){
                return false;
            }
            let swap=false;
            let prev=nums[0];
            for(let i=1;i<nums.length;i++){
                if(nums[i]<=prev){
                    if(swap){
                        return false;
                    }
                    swap=true;
                    if(i==1 || nums[i]>nums[i-2]){
                        prev=nums[i];
                    }
                }else{
                    prev=nums[i];
                }
            }
            return true;
    };