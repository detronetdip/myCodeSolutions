/**
 * @param {string[]} strs
 * @return {string}
 */
 var longestCommonPrefix = function(strs) {
    var len=strs[0].length;
    var res="";
    for(let i=0;i<len;i++){
        for(e of strs){
            if(i==e.length || e[i]!=strs[0][i]){
                return res;
            }
        }
        res+=strs[0][i];
    }
    return res;
};