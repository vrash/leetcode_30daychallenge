/*
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
*/


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
   public static int diameterOfBinaryTree(TreeNode root) {        
    if (root == null)
        return 0;

    int rootDiameter = getHeight(root.left) + getHeight(root.right);
    int leftDiameter = diameterOfBinaryTree(root.left);
    int rightDiameter = diameterOfBinaryTree(root.right);

    return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
}

public static int getHeight(TreeNode root) {
    if (root == null)
        return 0;

    return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
}
}
