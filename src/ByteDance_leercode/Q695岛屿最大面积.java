package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/13 0:13
 */
public class Q695岛屿最大面积 {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;//结果初始化为0
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    int a = area(grid, r, c);
                    res = Math.max(res, a);
                }
            }
        }
        return res;
    }

    int area(int[][] grid, int r, int c) {
        if (!inArea(grid, r, c)) {//越界则返回
            return 0;
        }
        if (grid[r][c] != 1) {//不是陆地则返回
            return 0;
        }
        grid[r][c] = 2;//标记为访问过了

        return 1
                + area(grid, r - 1, c)//上下左右遍历并计算面积
                + area(grid, r + 1, c)
                + area(grid, r, c - 1)
                + area(grid, r, c + 1);
    }

    boolean inArea(int[][] grid, int r, int c) {//判断越界
        return 0 <= r && r < grid.length
                && 0 <= c && c < grid[0].length;
    }

}
