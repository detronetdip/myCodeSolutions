class Solution {
    public boolean isValid(String s) {
        if(s.length()==1 || s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']') return false;
        Stack<Character> stack=new Stack();
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            if(current==')' || current=='}' || current==']'){
                if(stack.isEmpty()) return false;
                char c=stack.pop();
                if(map.get(current)!=c){
                    return false;
                }
            }else{
                stack.push(current);
            }
        }
       if(stack.isEmpty()){
            return true;
       }else{
           return false;
       }
    }
}