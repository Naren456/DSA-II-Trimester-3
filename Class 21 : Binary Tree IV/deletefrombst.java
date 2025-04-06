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
    public TreeNode deleteNode(TreeNode root, int key) {
     if(root == null){
        return null;
     }
     if(root.val == key){
         return Delete(root,key);
     }

     if(key < root.val){
        root.left =  deleteNode(root.left,key);
     }
     else if(key > root.val){
        root.right =  deleteNode(root.right,key);
     }
          
     return root;
    }

    public TreeNode Delete(TreeNode root, int key) {
        // 0 child //
        if(root.left == null && root.right == null){
            root = null;
            return root;
        }
        // 1 child //
        // right child //
        if(root.left==null){
            return root.right;
        }

        //left child //
        if(root.right == null){
            return root.left;
        }
        //2 child //
        // first find minValue from RightNode of root and swap with root node
        // then delete from the node;
        TreeNode minNode = MinNode(root.right);
        root.val = minNode.val;
        root.right =  Delete(root.right,minNode.val);
        return root;
    }
    TreeNode MinNode(TreeNode root){
        if(root.left==null){
            return root;
        }
         return MinNode(root.left);
    }
}