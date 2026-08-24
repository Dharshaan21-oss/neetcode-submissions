class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            
            char tens = details[i].charAt(details[i].length() - 4);
            char ones = details[i].charAt(details[i].length() - 3);
            
            
            if (tens > '6' || (tens == '6' && ones > '0')) {
                count++;
            }
        }
        return count;
    }
}
