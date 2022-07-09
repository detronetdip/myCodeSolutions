/**
 * @param {number[]} nums
 * @return {number}
 */
 var removeDuplicates = function(nums) {
    let p=-1;
        let map=new Map();
        for(let i=0;i<nums.length;i++){
            if(map.get(nums[i])==undefined){
                map.set(nums[i],1);
                nums[++p]=nums[i];
            }
        }
        return p+1;
};