import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer ss = new StringBuffer();
        for(int i = s.length()-1; i>=0;i--){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ss.append(Character.toLowerCase(ch));
            }
        }
        String tx = ss.toString();
        String sx = ss.reverse().toString();
        return tx.equals(sx);
    }
}