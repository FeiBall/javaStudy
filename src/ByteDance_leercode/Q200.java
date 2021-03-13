package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 *
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 *
 * 此外，你可以假设该网格的四条边均被水包围。
 */
public class Q200 {
    void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;//行数
        int nc = grid[0].length;//列数

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '2'||grid[r][c] == '0') {//越界或者已经访问过或者是水则返回
            return;
        }

        grid[r][c] = '2';//标记为2表示访问过
        dfs(grid, r - 1, c);//分别上下左右深度优先遍历
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }//若岛屿为空直接返回

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;//初始化岛屿数量为0
        for (int r = 0; r < nr; ++r) {//行遍历
            for (int c = 0; c < nc; ++c) {//列遍历
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }

        return num_islands;
    }

}
