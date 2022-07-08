/**
 * @param {number} x
 * @return {boolean}
 */
 var isPalindrome = function(x: number): boolean {
    if(x<0){
          return false;
      }
      let n=x;
       let t=0;
      while(x!=0){
          let y=x%10;
          x= parseInt(`${x/10}`);
          t=t*10+y;
      }
      if(n==t){
          return true;
      }else{
          return false;
      }
};