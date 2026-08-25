class Solution {
    public int scoreOfString(String s) {
        int total =0;
        for(int i=0;i<s.length()-1;i++){
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            int diff = Math.abs(a-b);
            total = total+diff;

        }
        return total;
    }
}