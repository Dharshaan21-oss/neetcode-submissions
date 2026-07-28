class Solution {
    public int maxSubArray(int[] nums) {
        int maxsofar=nums[0];
        int currsum=0;
        for(int num:nums){
            currsum+=num;
            if(currsum>maxsofar){
                maxsofar=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsofar;
    }
}
