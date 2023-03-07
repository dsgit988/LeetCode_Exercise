import java.util.Stack;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();

        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            TreeNode r = null;
            TreeNode l = null;
            if (temp.left != null){
                stack.add(temp.left);
                r = stack.peek();
            }
            if (temp.right != null){
                stack.add(temp.right);
                l = stack.peek();
            }

            if (r == null){
                temp.right = null;
            }else {
                temp.right = r;
            }
            if (l == null) {
                temp.left = null;
            }else {
                temp.left = l;
            }

        }
        return root;
    }
}
