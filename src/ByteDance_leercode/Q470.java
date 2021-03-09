package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * 已有方法 rand7 可生成 1 到 7 范围内的均匀随机整数，试写一个方法 rand10 生成 1 到 10 范围内的均匀随机整数。
 *
 * 不要使用系统的 Math.random() 方法。
 *
 * @date 2021/3/9 21:41
 */

/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
public class Q470 {
    public int rand7(){ return 1;}//只是为了消除错误，此行对本体无效

    public int rand10() {
        int num = (rand7() - 1) * 7 + rand7();//1~49 1/7*1/7=1/49
        while (num > 40){ //舍弃41~49的情况
            num = (rand7() - 1) * 7 + rand7();
        }

        return 1 + (num - 1) % 10;//0~40时

    }
}
