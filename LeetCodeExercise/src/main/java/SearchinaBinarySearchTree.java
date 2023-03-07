public class SearchinaBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode current = root;
        while (current != null){
            if (current.val > val){
                current = current.left;
            } else if (current.val < val) {
                current = current.right;
            }else {

                return current;
            }
        }
        return null;
    }
}
