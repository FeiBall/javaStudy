package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 时间N 空间为树的高度h(最坏情况下需要存放O（h）个函数调用)
 * @date 2021/3/13 13:46
 */
public class Q226反转二叉树 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    public TreeNode invertTree(TreeNode root){
        if(root==null)return null;//递归终止条件

        TreeNode tmp=root.left;//开始交换左右节点
        root.left=root.right;
        root.right=tmp;

        invertTree(root.left);//递归交换当前节点的左子树
        invertTree(root.right);

        return root;//返回根节点


    }
}
