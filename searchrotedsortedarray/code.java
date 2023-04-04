class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length -1;
        int ans=-1;

        while(l <= r){
            if(nums[l]== target){
                System.out.println(l);
                return l; 
            }else if(nums[r] == target){
                return  r;
            }
            int mid =(l+r)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[l] <= nums[mid]){
                   if(target > nums[mid] || target < nums[l]){
                    l= mid +1;
                   } else{
                       r=mid -1;
                   }
            }else{
                if(target > nums[r] || target < nums[mid] ){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }


        }
        return ans;   

    }
}
