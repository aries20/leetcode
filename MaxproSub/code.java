class Solution {
    public int maxProduct(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int max_product=nums[0];
        int n =nums.length;
        for(int i=1;i<n;i++){

         int temp_min = Math.min( nums[i] , Math.min( nums[i]*min, 
nums[i]*max ) );
           max = Math.max( nums[i] , Math.max( nums[i]*min , nums[i] * max 
));
            min=temp_min;
           max_product = Math.max(max_product,max);


        }

    return max_product;
        
    }
}
