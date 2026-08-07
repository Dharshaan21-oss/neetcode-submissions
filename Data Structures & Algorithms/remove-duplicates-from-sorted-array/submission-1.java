class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int pos=1;
        for(int i =1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[pos++]=nums[i];
            }
        }
        return pos;
    }
}