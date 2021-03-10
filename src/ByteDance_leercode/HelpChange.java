package ByteDance_leercode;

import java.util.Scanner;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/10 17:00
 */
public class HelpChange {

    public static void main(String[] args) {
        String s="";
        String pro="";
        String num="";
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        int left=0;
        int k=left;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='t'){
                pro=s.substring(left,i-1);//提取下标left~i-1的字符串
                System.out.println(pro+",");
                left=i+1;//滑动窗口移动
            }else if(s.charAt(i)=='n'){
//                    int k=left;
                    if(s.charAt(left)=='0'&&s.charAt(left+1)!='x'||s.charAt(left)=='x'&&s.charAt(left-1)!='0'){//不是0x开头,输入有问题
                        System.out.println("null");
                        break;
                    }else if(s.charAt(left)=='0'&&s.charAt(left+1)=='x'){//是0x开头
                        num=s.substring(left+2,i-1);
                        System.out.println(num);
                        left=i+1;
                    }else {//正常数字
                        num=s.substring(left,i-1);
                        System.out.println(num);
                        left=i+2;
                    }

            }else if(s.charAt(s.length()-1)!='n'){//这是最后一个数字但是末尾没有\n
                int len=s.length();
                num=s.substring(left,len);
                System.out.println(num);

            }
        }
        //晨光AFPM0801\t0x2\n斑马小楷\t40\n
    }

}
