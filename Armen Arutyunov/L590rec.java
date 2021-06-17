import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class L590rec {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        return helper(root, list);
    }

    public List<Integer> helper(Node root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        for (Node child : root.children) {
            helper(child, list);
        }
        list.add(root.val);
        return list;
    }
}
