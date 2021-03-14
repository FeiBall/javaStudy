package ByteDance_leercode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/13 14:22
 */
public class Q637二叉树的层平均值 {
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

    /**
     * 广度优先遍历
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return null;
        }

        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>(); // 使用队列这个容器
        queue.add(root);//压入根节点

        while (!queue.isEmpty()) {//当队列不为空
            int levelNodesCount = queue.size(); // 获取当前层的大小
            double sum = 0.0;

            for (int i = 0; i < levelNodesCount; ++i) {
                // 遍历二叉树中的每一层
                TreeNode temp = queue.peek();//返回队列头部元素（不弹出
                sum += temp.val;

                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }

                queue.poll();//移除并返回队列头部的元素     如果队列为空，则返回null
            }

            res.add(sum / levelNodesCount);
        }

        return res;
    }
}
