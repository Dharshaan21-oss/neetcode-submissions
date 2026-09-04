

class Solution {
    public int majorityElement(int[] nums) {
        int n2 = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies of each number
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        // Traverse the map using entrySet to find and return the majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n2) {
                return entry.getKey(); // Correctly returns from majorityElement
            }
        }
        
        return -1; // Fallback return statement required by Java compiler
    }
}
