package ByteDance_leercode;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/20 0:07
 */
public class 二叉树的完全性检验 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        TreeNode prev=root;
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node=queue.remove();
            if(prev==null&&node!=null) return false;
            if(node!=null){
                queue.add(node.left);
                queue.add(node.right);
            }
            prev=node;
        }
        return true;

    }
}
