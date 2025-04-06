public class InsertatNode {
    public TreeNode insert(TreeNode root ,int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(root.val < x){
            TreeNode node  =  inset(root.right,val);
            root.right = node;
        }
        else{
            TreeNode node = inset(root.left,val);
            root.left = node;
        }
        return root;
    }
}
