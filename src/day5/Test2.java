package day5;

import java.io.*;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/5 13:52
 */
public class Test2 {
    public static void main(String[] args) {
        try {
//            Test2.testSystemIn();
            Test2.writeToTxt();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void testSystemIn()throws Exception{
        //创建一个接受键盘输入数据的的输入流
        InputStreamReader is=new InputStreamReader(System.in);
        //把输入流放到缓冲流里面
        BufferedReader br=new BufferedReader(is);

        String str="";//定义一个临时接受数据的字符串

        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
        is.close();
    }

    /**
     * 把控制台接收到的内容写到指定txt文件中，当接收到over时，结束
     */
    public static void writeToTxt()throws Exception{
        //创建一个接受键盘输入数据的的输入流
        InputStreamReader is=new InputStreamReader(System.in);
        //把输入流放到缓冲流里面
        BufferedReader br=new BufferedReader(is);

        BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\javaStudy\\src\\day5\\tt7.txt"));


        String str="";//定义一个临时接受数据的字符串

        while((str=br.readLine())!=null){
            if(str.equals("over")){
                break;
            }
            bw.write(str);
        }
        bw.flush();
        bw.close();
        br.close();
        is.close();
    }

}
