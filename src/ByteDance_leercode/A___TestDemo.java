package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/8 21:08
 */
public class A___TestDemo {
    public static void main(String[] args) {
        Q70 a=new Q70();
        System.out.println(a.climbStairs(3));

        Q121 b=new Q121();
        System.out.println(b.maxProfit(new int[]{7,1,5}));

//        Q_Wood c=new Q_Wood();
////        c.Wood(5,5);
//        System.out.println(c.Wood(5,7));
        Q31 d=new Q31();
        int[] aa=new int[]{1,2,3};
        d.nextPermutation(aa);
        for(int aaa:aa){
            System.out.println(aaa);
        }
    }

}
