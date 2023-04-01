/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public TreeNode converttobinary(int[] nums,int left,int right){
        
        if(left>right){return null;}

        

        int middle=left + (right-left)/2;

        TreeNode node = new TreeNode(nums[middle]);
        
        node.left= converttobinary(nums,left,middle-1);

        node.right= converttobinary(nums,middle+1,right);

        return node;

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){return null;}
        int right = nums.length-1;
        int left=0;
        return converttobinary(nums,left,right);

    }
}
