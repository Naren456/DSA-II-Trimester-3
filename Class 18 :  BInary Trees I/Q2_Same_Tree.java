public class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true; // Both trees are empty
        if (p == null || q == null) return false; // One tree is empty, the other is not
        if (p.value != q.value) return false; // Values are different

        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        // Example usage
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        Same_Tree solution = new Same_Tree();
        boolean result = solution.isSameTree(p, q);
        System.out.println("Are the two trees the same? " + result); // Output: true
    }
}
