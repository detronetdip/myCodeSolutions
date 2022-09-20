class Solution {
    private static boolean isAnagram(String a,String b){
        int[] t=new int[26];
        for(char c:a.toCharArray()){
            t[c-'a']++;
        }
        for(char c:b.toCharArray()){
            t[c-'a']--;
        }
        for(int i:t){
            if(i!=0) return false;
        }
        return true;
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>();
        int start=0;
        for(int i=1;i<words.length;i++){
            if(isAnagram(words[start],words[i])){
                continue;
            }else{
                list.add(words[start]);
                start=i;
            }
        }
        list.add(words[start]);
        return list;
    }
}