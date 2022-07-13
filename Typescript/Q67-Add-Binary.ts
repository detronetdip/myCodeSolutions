function addBinary(a: string, b: string): string {
    var s="";
       var carry=0;
       var i=a.length-1;
       var j=b.length-1;
       while(i>=0 || j>=0){
           var sum=carry;
           if(i>=0) sum+=a.charCodeAt(i)-48;
           if(j>=0) sum+=b.charCodeAt(j)-48;
           i--;
           j--;
           carry=sum>1?1:0;
           sum%=2;
           s=`${sum}`+s;
       }
       return carry==1?`${carry}`+s:s;
   };