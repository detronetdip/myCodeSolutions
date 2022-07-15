/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */

 function help(root,number){
  if(root==null){
      return;
  }else{
      help(root.left,number);
      number.push(root.val);
      help(root.right,number);
  }
}
var inorderTraversal = function(root) {
  var number=[];
  help(root,number);
  return number;
};