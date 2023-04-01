class Solution {
    public int[] productExceptSelf(int[] nums) {
     int pre = 1;
     int post = 1;
     int n = nums.length;
     int[] ans = new int[n];
     for(int i=0;i<n;i++){
        if(i==0){
            ans[i]=1;
        }
        else{
            pre=pre*nums[i-1];
            ans[i]=pre;
        }
     }

     for(int j=n-1;j>=0;j--){
         if(j==n-1){
             ans[j]=ans[j]*post;
         }
         else{
             post=post*nums[j+1];
             ans[j]=ans[j]*post;
         }
     }

    return ans;
    }
}
