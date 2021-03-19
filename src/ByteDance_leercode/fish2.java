package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/18 23:40
 */
public class fish2 {
    public int[] nextMoreCustomersInterval (int[] customers) {
        if(customers.length==0){return null;}
        // write code here
        int len=customers.length;
        int[] res=new int[len];//结果数组
        int k=0;//结果数组的下标

        for(int i=0;i<len;i++){

            if(i==len-1){//若是最后一个则直接为0
                res[len-1]=0;
            }

            int index=1; //代表多少天后是增长的
            for(int j=i;j<len-1;j++){

                if(customers[j+1]>customers[i]){
                    res[k]=index;
                    k++;
                    break;
                }else {
                    index++;
                }
                if(index==len-i){
                    res[k]=0;
                    k++;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        fish2 aaa=new fish2();
        int[] tt=new int[]{199,221,230,212,210,225,245,255,240};
        aaa.nextMoreCustomersInterval(tt);
        int[] bbb=aaa.nextMoreCustomersInterval(tt);
        for(int i=0;i<bbb.length;i++){
            System.out.print(bbb[i]);
        }
    }
}
