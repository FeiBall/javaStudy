package ByteDance_leercode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/13 16:20
 */
public class M美团2 {
    public static void main(String[] args) {
        String s="";//输入字符串
        String res="";//结果
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        int left=0;//滑动窗口左下标
        int right=0;//滑动窗口右下标
        int len=s.length();//字符串长度

        if(s.length()==0)  return;//空字符串直接return

        int[] nums=new int[1000];
        int k=0;
        int v=0;

        for(int i=0;i<len;i++){

                left=i;
                if(s.charAt(left)=='0'){//左下标遇到0
                    right=left;
                    if(right+1<len){
                        while(s.charAt(right+1)=='0'){//判断有几个0
                            right++;
                            i=right;
                        }
                        if(s.charAt(right+1)>='1'&&s.charAt(right+1)<='9'){//如果是碰到001230这种数字
                            left=right+1;
                            right=left;
                            while(s.charAt(right+1)>='0'&&s.charAt(right+1)<='9'){
                                right++;//滑动窗口右下标继续右移动
                                i=right;
                            }
                            res=s.substring(left,right+1);
                            v= Integer.parseInt(res);
                            nums[k]=v;
                            k++;
//                    System.out.println(v);
//                    System.out.println(res);//输出一个结果
                            left=right+1;
                            i=left-1;
                        }else if(s.charAt(right+1)<'0'||s.charAt(right+1)>'9'){//若是000...这种   if(s.charAt(right+1)!='0'&&s.charAt(right+1)<'0'&&s.charAt(right+1)>'9')

                            if(right+1<=len){
                                nums[k]=0;
                                k++;
                                left=right+1;//移动窗口
                                right=left;
                                if(i<len) i=left-1;
                            }else if(right==len-1){

                                nums[k]=0;
                                k++;
//                        System.out.println("0");//输出0;
                                break;
                            }

                        }
                    }else break;

                }else if(s.charAt(left)>='1'&&s.charAt(left)<='9'){//碰到没有前导0的类似于123这种
                    right=left;
                    if(right+1<len){
                        while(s.charAt(right+1)>='0'&&s.charAt(right+1)<='9'){
                            right++;//滑动窗口右下标继续右移动
                            i=right;
                        }
                        res=s.substring(left,right+1);
                        v= Integer.parseInt(res);
                        nums[k]=v;
                        k++;
                    }else break;

//                for(int ii=left;ii<=right;ii++){
//                    System.out.print(s.charAt(ii));
//                }
//                System.out.println("");
//                res=s.substring(left,right+1);
//                System.out.println(res+s.charAt(right));//输出一个结果
                    if(right>=len){
                        break;
                    }else{
                        left=right+1;
                        i=left-1;
                    }

                }


        }

        Arrays.sort(nums);
        for(int i=0;i<k;i++){
            System.out.println(nums[i]);
        }
    }
}
