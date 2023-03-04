import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }

    public void traversal(TreeNode node, List<Integer> list){
        if (node == null) return;
        traversal(node.left, list);
        traversal(node.right, list);
        list.add(node.val);
    }
}
