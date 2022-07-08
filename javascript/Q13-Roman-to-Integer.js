/**
 * @param {string} s
 * @return {number}
 */
 var romanToInt = function(s) {
    let map=new Map();
        map.set('I',1);
        map.set('V',5);
        map.set('X',10);
        map.set('L',50);
        map.set('C',100);
        map.set('D',500);
        map.set('M',1000);
        let total=0;
        for(let i=0;i<s.length;i++){
            let currentValue=map.get(s.charAt(i));
            if(i!=0){
                let previousValue=map.get(s.charAt(i-1));
                if(currentValue > previousValue){
                    total-=previousValue;
                    total+=(currentValue-previousValue);
                }else{
                 total+=currentValue;   
                }
            }else{
                total+=currentValue;
            }
        }
        return total;
};
