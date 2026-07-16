class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        for(char ss: s.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(ss)){
                arr.add(ss);
            }
        }
        ArrayList<Character> revarr = new ArrayList<>();
        for(int j = arr.size() - 1; j >= 0; j--){
            revarr.add(arr.get(j));
        }
        if(arr.equals(revarr)){
            return true;
        }
        return false; 
    }
}