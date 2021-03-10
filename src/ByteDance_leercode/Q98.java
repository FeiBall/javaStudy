package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * @date 2021/3/9 14:25
 */
public class Q98 {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode() {
          }

          TreeNode(int val) {
              this.val = val;
          }

          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }

      }

//      int pre=Integer.MIN_VALUE;
    long pre=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {

        if(root==null) return true;

        //按照中序遍历 左跟右 顺序遍历

        //1 2 3

        //left
        if (!isValidBST(root.left)) {
            return false;
        }
        // 访问当前节点：如果当前节点小于等于中序遍历的前一个节点，说明不满足BST，返回 false；否则继续遍历。
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        // 访问右子树
        return isValidBST(root.right);

    }

}
