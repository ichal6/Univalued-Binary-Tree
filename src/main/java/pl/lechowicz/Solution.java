package pl.lechowicz;

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root.left != null)
            if(root.left.val != root.val)
                return false;
            else if (!isUnivalTree(root.left))
                return false;

        if(root.right != null)
            if(root.right.val != root.val)
                return false;
            else return isUnivalTree(root.right);

        return true;
    }
}