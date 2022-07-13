class Solution {
    static int sum(int a,int b){
        if(a==1 && b==1){
            return 0;
        }
        else if(a==0 && b==0){
            return 0;
        }
        else {
            return 1;
        }
        
    }
    public String addBinary(String a, String b) {
        int carry=0;
        String s="";
        int al=a.length()-1;
        int bl=b.length()-1;
        int l=al>bl? al:bl;
        String li=a.length()>b.length()? a:b;
        for(int i=l;i>=0;i--){
            if(al>=0 && bl>=0){
                if(a.charAt(al) == '1' && b.charAt(bl)=='1'){
                    s=String.valueOf(sum(0,carry))+s;
                    carry=1;
                }else if(a.charAt(al) == '0' && b.charAt(bl)=='0'){
                    s=String.valueOf(sum(0,carry))+s;
                    carry=0;
                }else{
                    s=String.valueOf(sum(1,carry))+s;
                    carry= carry==1?1:0;
                }
                al--;
                bl--;
            }else{
                int k=li.charAt(i)=='1'?1:0;
                s=String.valueOf(sum(k,carry))+s;
                carry= carry==1 && k==1?1:0;
            }
        }
        return carry==1?"1"+s:s;
    }
}