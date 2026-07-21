class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> sar = new ArrayList<>();
        ArrayList<Character> tar = new ArrayList<>();
        for(char ss: s.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(ss)){
                sar.add(ss);
            }
            
        }
        for(int i = sar.size()-1; i>=0; i--){
            tar.add(sar.get(i));

        }
        return sar.equals(tar);
    }
}
