class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum= sum + nums[i];
        }
        int sum2=(n*(1+n))/2;

        return sum2-sum;
    }
}
