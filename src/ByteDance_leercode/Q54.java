package ByteDance_leercode;
import java.util.ArrayList;
import java.util.List;
/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 * @date 2021/3/9 20:43
 */
public class Q54 {
    public List<Integer> spiralOrder(int[][] matrix){
        int left=0,right=matrix[0].length-1,top=0,below=matrix.length-1;//得到上下左右边界
        List<Integer> list =new ArrayList<>();
        int sum=(right+1)*(below+1);//元素总个数
        int num=1;

        //开始遍历
        while(num<=sum){
            for(int i=left;i<=right&&num<=sum;i++){//从左到右
                list.add(matrix[top][i]);
                num++;
            }
            top++;
            for(int i=top;i<=below&&num<=sum;i++){//从上到下
                list.add(matrix[i][right]);
                num++;
            }
            right--;
            for(int i=right;i>=left&&num<=sum;i--){//从右到左
                list.add(matrix[below][i]);
                num++;
            }
            below--;
            for(int i=below;i>=top&&num<=sum;i--){//从下往上
                list.add(matrix[i][left]);
                num++;
            }
            left++;
        }
        return list;


    }
}
