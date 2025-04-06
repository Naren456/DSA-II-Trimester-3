public class MirrorImage {
    // Definition of TreeNode class


    public static boolean mirrorImage(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        if (p.val != q.val) return false;
        return mirrorImage(p.left, q.right) && mirrorImage(p.right, q.left);
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(5);
        q.right = new TreeNode(2);

        boolean result = mirrorImage(p, q);
        System.out.println("Are the two trees mirror images? " + result); // Output: true
    }
}
