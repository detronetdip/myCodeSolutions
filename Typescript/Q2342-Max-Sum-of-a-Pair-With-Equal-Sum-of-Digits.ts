function sum(n:number):number{
    let s=0;
    while(n!=0){
        s+=(n%10);
        n=parseInt(`${n/10}`);
    }
    return s;
}
function maximumSum(nums: number[]): number {
if(nums.length==0){
        return 0;
    }
    let max=-2147483648;
    let map= new Map();
    for(let i=0;i<nums.length;i++){
        let s=sum(nums[i]);
        if(map.get(s)!=null){
            max=Math.max((nums[i]+nums[map.get(s)]),max);
            if(nums[i]>nums[map.get(s)]){
                map.set(s,i);
            }
        }else{
            map.set(s,i);
        }
    }
    return max==-2147483648?-1:max;
};