import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root,list);
        return list;
    }

    public void traversal(TreeNode node, List<Integer> list){
        if(node == null) return;
        traversal(node.left, list);
        list.add(node.val);
        traversal(node.right, list);

    }
}
