class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> ss = new ArrayList<>();
        ArrayList<Character> tt = new ArrayList<>();
        for(char sx: s.toCharArray()){
            ss.add(sx);
        }
        for(char tx: t.toCharArray()){
            tt.add(tx);
        }
        Collections.sort(ss);
        Collections.sort(tt);
        if(ss.equals(tt)){
            return true;
        }
        return false;

    }
}