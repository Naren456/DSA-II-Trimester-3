public class Q3_SymmetricTree {
    public TreeNode Symmetrc(TreeNode root){

    }
    public TreeNode MirrorImage(TreeNode p ,TreeNode q){
        if(p==null ||  q==null) return p==q;
        if(p.val != q.val){
            return false;
        }
        return MirrorImage(p.left,q.right) && MirrorImage(p.right, q.left); 
    }
}
