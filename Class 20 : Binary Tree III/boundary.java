public class boundary {
    /**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
//  * }
//  */
// class Solution {
//     public ArrayList<Integer> solve(TreeNode root) {
//         ArrayList<Integer> Boundary = new ArrayList<>();
//         if(root == null){
//             return null;
//         }
//         Boundary.add(root.val);

//         LeftBoundary(root.left,Boundary);

//         LeavesNode(root,Boundary);

//         RightBoundary(root.right,Boundary);

//         return Boundary;
//     }
//      void LeavesNode(TreeNode root,ArrayList<Integer> Boundary){
//          if(root==null){
//              return;
//          }
//          if(root.right==null && root.left==null){
//              Boundary.add(root.val);
//              return;
//          }
         
//          LeavesNode(root.left,Boundary);
//          LeavesNode(root.right ,Boundary);
//      }
//     void RightBoundary(TreeNode root , ArrayList<Integer> Boundary){
//      if(root ==null || root.left==null && root.right == null){
//          return;
//      }
   
//      if(root.right!=null){
//          RightBoundary(root.right,Boundary);
//      }
//      else{
//          RightBoundary(root.left,Boundary);
     
//      }
//      Boundary.add(root.val);
     
//     }
//     void LeftBoundary(TreeNode root, ArrayList<Integer> Boundary){
//        if(root == null || root.left== null && root.right == null){
//          return;
//      }
//      Boundary.add(root.val);
//      if(root.left!=null){
//          LeftBoundary(root.left,Boundary);
//      }
//      else{
//          LeftBoundary(root.right,Boundary);
//      }

//     }
// }

// }
