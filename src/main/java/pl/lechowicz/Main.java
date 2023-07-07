package pl.lechowicz;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean isUniVal = solution.isUnivalTree(initialTree());
        System.out.println(isUniVal);
    }

    //[9,9,6,9,9]
    private static TreeNode initialTree() {
        var root = new TreeNode(9);

        root.left = new TreeNode(9);

        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(9);

        root.right = new TreeNode(6);

        return root;
    }
}