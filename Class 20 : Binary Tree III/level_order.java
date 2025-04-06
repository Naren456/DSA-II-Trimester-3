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

public class level_order {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>  queue =  new LinkedList<>();
        List<List<Integer>> ans  =  new ArrayList<>();
        if(root == null){
            return ans;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int size =queue.size();
            List<Integer> temp = new ArrayList<>();
           for(int i=0;i<size;i++){
            TreeNode tree =  queue.poll();
            temp.add(tree.val);
            if(tree.left!=null){
                queue.offer(tree.left);
            }
            if(tree.right!=null){
               queue.offer(tree.right);
            }
         
        }
           ans.add(temp);
        }
        return ans;
    }
}