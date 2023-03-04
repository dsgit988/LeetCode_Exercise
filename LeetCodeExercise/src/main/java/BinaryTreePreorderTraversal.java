import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }

    public void traversal(TreeNode node, List list){

        if (node == null) return;
        list.add(node.val);
        if (node.left != null) traversal(node.left, list);
        if (node.right != null) traversal(node.right, list);

    }
}
