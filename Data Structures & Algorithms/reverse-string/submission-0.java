class Solution {
    public void reverseString(char[] s) {
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        sb.reverse();
        String ss = new String(sb);
        int i =0;
        for(int n:s){
            s[i] = ss.charAt(i);
            i++;
        }
    }
}