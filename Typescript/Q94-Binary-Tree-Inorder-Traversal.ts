/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */
function help(root: TreeNode, number: number[]): void {
  if (root == null) {
    return;
  } else {
    help(root.left, number);
    number.push(root.val);
    help(root.right, number);
  }
}
function inorderTraversal(root: TreeNode | null): number[] {
  var number = [];
  help(root, number);
  return number;
}
