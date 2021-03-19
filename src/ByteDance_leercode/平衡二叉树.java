package ByteDance_leercode;

import javax.swing.tree.TreeNode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/19 22:32
 */
public class 平衡二叉树 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val=val;}
    }

    public boolean isBalanced(TreeNode root) {
        int res=postOrder(root);
        return res==-1?false:true;
    }

    public int postOrder(TreeNode root){
        if(root==null) return 0;
        int left=postOrder(root.left);
        if(left==-1) return -1;
        int right=postOrder(root.right);
        if(right==-1) return -1;

        return Math.abs(left-right)<2?Math.max(left,right)+1:-1;
    }


}
