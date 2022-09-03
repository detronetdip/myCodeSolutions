class Solution {
    public int mostWordsFound(String[] sentences) {
        int res=0;
        for(int i=0;i<sentences.length;i++){
            res=Math.max(res,sentences[i].split(" ",-1).length);
        }
        return res;
    }
}