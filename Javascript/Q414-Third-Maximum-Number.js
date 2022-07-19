/**
 * @param {number[]} nums
 * @return {number}
 */
 var thirdMax = function(nums) {
    if(nums.length==0){
        return 0;
    }
let first=null;
let second=null;
let third=null;
for(let i of nums){
    if((i==first) || (i==second) || (i==third)){
        continue;
    }
    if(first==null || i>first){
        third=second;
        second=first;
        first=i;
    }else if(second==null || i>second){
         third=second;
        second=i;
    }else if(third==null || i>third){
        third=i;
    }
}
return third==null?first:third;
};