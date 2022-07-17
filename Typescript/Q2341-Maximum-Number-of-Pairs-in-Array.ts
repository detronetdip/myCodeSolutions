function numberOfPairs(nums: number[]): number[] {
    if(nums.length==0){
               let ar=[0,0];
           }
           let pair=0;
           let left =0;
           let table=new Map();
           for(let i=0;i<nums.length;i++){
               if(table.get(nums[i])!=null){
                   let occur=table.get(nums[i]);
                   occur++;
                   pair+=parseInt(`${occur/2}`);
                   occur%=2;
                   table.set(nums[i],occur);
               }else{
                   table.set(nums[i],1);
               }
           }
            table.forEach((value,key)=>{
                left+=value;
            });
           let ar=[pair,left];
           return ar;
   };