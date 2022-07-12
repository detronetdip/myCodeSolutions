/**
 * @param {string} s
 * @return {number}
 */
 var lengthOfLastWord = function(s) {
    let count=0;
        for(let i=s.length-1;i>=0;i--){
            if(s.charAt(i)!=" "){
                count++;
            }else if(count>0){
                break;
            }
        }
        return count;
};