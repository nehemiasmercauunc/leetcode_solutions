public class BalancedBinaryTree {

    //O(n)
    
    public static boolean solution(TreeNode root){
        int[] balanced = dfs(root);
        if(balanced[0] == 1){
            return true;
        } else {
            return false;
        }
    }

    //Asi tira el 100% el leetcode, pero es por la memoria que usa y alguna declaracion de variable extra.
    //Aca se hace todo de una sin declarar casi nada, asi que mejora, pero no es relevante.
    public static int[] dfs(TreeNode root){
        if(root == null){
            return new int[] {1, 0};
        }

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        // boolean balanced = (
        //     (left[0]==1 && right[0]==1) &&
        //     (Math.abs(left[1]-right[1]) <= 1)
        // );
        return new int[] {((
            (left[0]==1 && right[0]==1) &&
            (Math.abs(left[1]-right[1]) <= 1)
        ) ? 1 : 0), 1 + Math.max(left[1], right[1])};
    }

    /*
     * Este es mas entendible, pero ocupa mas memoria, pero bueee, 8mbytes mas, tampoco tanto
     */
    // public static int[] dfs(TreeNode root){
    //     if(root == null){
    //         return new int[] {1, 0};
    //     }

    //     int[] left = dfs(root.left);
    //     int[] right = dfs(root.right);

    //     boolean balanced = (
    //         (left[0]==1 && right[0]==1) &&
    //         (Math.abs(left[1]-right[1]) <= 1)
    //     );
    //     int isBalanced = (balanced ? 1 : 0);
    //     int maxHeight = Math.max(left[1], right[1]);

    //     return new int[] {isBalanced, 1 + maxHeight};
    // }
}
