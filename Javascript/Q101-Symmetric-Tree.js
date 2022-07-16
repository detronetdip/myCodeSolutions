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
 * @return {boolean}
 */
 function helper(p,q){
    if(p==null && q==null){
            return true;
        }else if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return helper(p.left,q.right) && helper(p.right,q.left);
}
var isSymmetric = function(root) {
    if(root==null) return false;
    return helper(root.left,root.right);
};