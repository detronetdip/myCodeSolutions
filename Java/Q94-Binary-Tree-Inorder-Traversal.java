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
  public static void help(TreeNode root,List<Integer> list){
      if(root==null){
          return;
      }else{
          help(root.left,list);
          list.add(root.val);
          help(root.right,list);
      }
  }
  public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> list=new ArrayList<Integer>();
      help(root,list);
      return list;
  }
}