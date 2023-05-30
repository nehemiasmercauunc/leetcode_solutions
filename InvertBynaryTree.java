public class InvertBynaryTree {

    //time complexity: O(n)
    //espace complexity: O(n)
    //Otra forma
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    //Otra forma. Es la mejor, ocupa menos espacio (menos variables)
    public TreeNode invertTree2(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree2(root.left);
        invertTree2(root.right);
        return root;
    }

    //otra forma
    public TreeNode invertTree3(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree3(root.right);
        TreeNode left = invertTree3(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}
