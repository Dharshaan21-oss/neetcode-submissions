class Solution {
    public int lengthOfLastWord(String s) {
        String[] ss = s.split(" ");
        String sx = ss[ss.length-1];
        return sx.length(); 
    }
}