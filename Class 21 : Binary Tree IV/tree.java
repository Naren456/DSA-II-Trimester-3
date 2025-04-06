class TreeNode{
    int value;
    TreeNode left; 
    TreeNode right; 
    int val;

    public TreeNode(int val) {
        left = null;
        right = null;
        this.value = val;
    }
}
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left  =  maxDepth(root.left);
        int right  = maxDepth(root.right);
        return Math.max(left,right) + 1 ;
        // SC O(N)
        //TC 0(N)
    }
}
public class tree{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Solution t = new Solution();
        System.out.println(t.maxDepth(root));
    }
}
// Compare this snippet from Class%2018%20%3A%20%20BInary%20Trees%20I/MaxDepth.java:
// public class MaxDepth {
//     public int maxDepth(TreeNode root) {     