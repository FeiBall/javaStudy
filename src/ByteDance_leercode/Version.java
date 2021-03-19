package ByteDance_leercode;

import java.util.Scanner;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/17 15:05
 */
public class Version {
    public static void main(String[] args) {
        String str="";
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();//输入字符串
        int strlen=str.length();
        int left=0;
        int right=0;
        int count=0;
        String str1="";
        String str2="";

        for(int i=0;i<strlen;i++){
            if(str.charAt(i)=='“'&&count==0){
                left=i+1;
                count++;
            }else if(str.charAt(i)=='”'&&count==1){
                right=i;
                count++;
                str1=str.substring(left,right);
            }else if(str.charAt(i)=='“'&&count==2){
                left=i+1;
                count++;
            }else if(str.charAt(i)=='”'&&count==3){
                right=i;
                count++;
                str2=str.substring(left,right);
            }

        }

        int l1=str1.length();
        int l2=str2.length();

        for(int i=0;i<l1;i++){
            if(str1.charAt(i)>str2.charAt(i)){
                System.out.println(1);;
                return;
            }else if(str1.charAt(i)<str2.charAt(i)){
                System.out.println(-1);
                return;
            }else if(str1.charAt(i)==str2.charAt(i)){
                continue;
            }
        }
        if(l1<l2){
            for(int i=l1+1;i<l2;i++){
                if(str2.charAt(i)=='.'){
                    continue;
                }else if(str2.charAt(i)>'0'){
                    System.out.println(-1);
                    return;
                }
            }
        }
        if(l1>l2){
            for(int i=l2+1;i<l1;i++){
                if(str1.charAt(i)=='.'){
                    continue;
                }else if(str1.charAt(i)>'0'){
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(0);
        return;
    }


}
