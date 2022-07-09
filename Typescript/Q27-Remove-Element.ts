function removeElement(nums: number[], val: number): number {
    let iN=0,j=nums.length;
            if(nums.length==1 && nums[0]!=val) return 1;
            if(nums.length==1 && nums[0]==val) return 0;
             for(let i=0;i<j;i++){
                if(nums[i]!=val){
                    nums[iN]=nums[i];
                    iN++;
                }
            }
            return iN;  
    };