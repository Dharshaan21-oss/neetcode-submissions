class Solution {
    public int appendCharacters(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        int sLength = s.length();
        int tLength = t.length();

        // Traverse both strings to find the longest matching subsequence
        while (sIndex < sLength && tIndex < tLength) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                tIndex++; // Move t pointer if characters match
            }
            sIndex++; // Always move s pointer
        }

        // The remaining characters in t must be appended to s
        return tLength - tIndex;
    }
}
