
public boolean isBalanced(TreeNode root) {
    return solve(root)==-1 ? false : true ;
}

public int solve(TreeNode root){
    if(root == null){
        return 0;
    }
    int left  =  solve(root.left);
    int right  =  solve(root.right);
    if(left==-1 || right==-1) return -1;
    if(Math.abs(left-right)> 1) return -1;
    return (Math.max(left,right)+1);
}