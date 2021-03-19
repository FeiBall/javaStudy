package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/19 0:07
 */
public class fish3 {
    public int categoryOfMaxWarehouseArea (int[][] grid) {
        int res = 0;//结果初始化为0
        int res1=1;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    int a = area(grid, r, c,1);
                    if(res<a){
                        res=a;
                        res1=1;
                    }
                }
                if(grid[r][c]==2){
                    int a=area(grid,r,c,2);
                    if(res<a){
                        res=a;
                        res1=2;
                    }
                }
                if(grid[r][c]==3){
                    int a=area(grid,r,c,2);
                    if(res<a){
                        res=a;
                        res1=3;
                    }
                }
                if(grid[r][c]==4){
                    int a=area(grid,r,c,2);
                    if(res<a){
                        res=a;
                        res1=4;
                    }
                }
                if(grid[r][c]==5){
                    int a=area(grid,r,c,2);
                    if(res<a){
                        res=a;
                        res1=5;
                    }
                }
                if(grid[r][c]==6){
                    int a=area(grid,r,c,2);
                    if(res<a){
                        res=a;
                        res1=6;
                    }
                }
                if(grid[r][c]==7){
                    int a=area(grid,r,c,2);
                    if(res<a){
                        res=a;
                        res1=7;
                    }
                }
                if(grid[r][c]==8){
                    int a=area(grid,r,c,2);
                    if(res<a){
                        res=a;
                        res1=8;
                    }
                }
                if(grid[r][c]==9){
                    int a=area(grid,r,c,2);
                    if(res<a){
                        res=a;
                        res1=9;
                    }
                }
            }
        }
        return res1;
    }

    int area(int[][] grid, int r, int c,int t) {
        if (!inArea(grid, r, c)) {//越界则返回
            return 0;
        }
        if (grid[r][c] != t) {//不是陆地则返回
            return 0;
        }
        grid[r][c] = 100;//标记为访问过了

        return 1
                + area(grid, r - 1, c,t)//上下左右遍历并计算面积
                + area(grid, r + 1, c,t)
                + area(grid, r, c - 1,t)
                + area(grid, r, c + 1,t);
    }

    boolean inArea(int[][] grid, int r, int c) {//判断越界
        return 0 <= r && r < grid.length
                && 0 <= c && c < grid[0].length;
    }
}
