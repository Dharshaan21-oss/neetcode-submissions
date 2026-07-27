class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int l = nums[0];
        int m = nums[1];
        int n = nums[nums.length-1];
        int o = nums[nums.length-2];
        int p = o*n-l*m;
        return p;
    }
}