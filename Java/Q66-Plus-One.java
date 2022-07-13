class Solution {
    public int[] plusOne(int[] digits) {
        int[] arr=null;
        int c=0;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else {
                digits[i]++;
                return digits;
            }
        }
        arr=new int[digits.length+1];
        arr[0]=1;
        return arr;
        
    }
}