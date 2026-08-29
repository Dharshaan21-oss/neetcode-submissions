
class Solution { 
    public boolean isAnagram(String s, String t) { 
        // Convert strings to character arrays
        char[] ss = s.toCharArray(); 
        char[] tt = t.toCharArray(); 
        
        // Sort both arrays
        Arrays.sort(ss); 
        Arrays.sort(tt); 
        
        // Return true if they are identical
        return Arrays.equals(ss, tt); 
    } 
}
