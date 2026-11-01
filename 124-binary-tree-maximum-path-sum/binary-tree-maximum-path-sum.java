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

    int maxGain = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

        maxSum(root);
        return maxGain;
        
    }

    public int maxSum(TreeNode root){

        if(root==null) return 0;

        int leftSum = Math.max(0,maxSum(root.left));
        int rightSum = Math.max(0,maxSum(root.right));

        maxGain = Math.max(maxGain, root.val+leftSum+rightSum);

        return root.val + Math.max(leftSum,rightSum);
    }
}