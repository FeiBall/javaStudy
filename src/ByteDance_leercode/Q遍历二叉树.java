package ByteDance_leercode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/17 15:33
 */
public class Q遍历二叉树 {
    class Solution {
        public class TreeNode{
            int val;
            TreeNode left;
            TreeNode right;
        }
        public List<List<Integer>> BFS(TreeNode root) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            if (root == null) {
                return result;
            }

            Queue<TreeNode> que = new LinkedList<TreeNode>();//新建队列
            que.offer(root);
            while (!que.isEmpty()) {
                List<Integer> level = new ArrayList<Integer>();
                int currentLevelSize = que.size();//当前层数
                for (int i = 1; i <= currentLevelSize; ++i) {
                    TreeNode node = que.poll();
                    level.add(node.val);
                    if (node.left != null) {
                        que.offer(node.left);
                    }
                    if (node.right != null) {
                        que.offer(node.right);
                    }
                }
                result.add(level);
            }

            return result;
        }
    }

}
