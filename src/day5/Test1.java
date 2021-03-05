package day5;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/5 13:29
 */

import java.io.*;

/**
 * 缓冲字符流
 */
public class Test1 {
    public static void main(String[] args) throws Exception{
        Test1.testBufferedReader();
        Test1.testBufferedWriter();
        Test1.copyFile();

    }

    /**
     * 缓冲字符输入流
     */
    public static void testBufferedReader() throws Exception{

        FileReader fr=new FileReader("F:\\javaStudy\\src\\day5\\tt.txt");

        BufferedReader br=new BufferedReader(fr);

        char[] c=new char[100];
        int len=0;
        while((len=br.read(c))!=-1){
            System.out.println(new String(c,0,len));
        }
        br.close();
        fr.close();
    }

    /**
     * 缓冲字符输出流
     */
    public static void testBufferedWriter()throws Exception{
        FileWriter fw=new FileWriter("F:\\javaStudy\\src\\day5\\tt3.txt");

        BufferedWriter bw=new BufferedWriter(fw);

        String s="hello 1234";

        bw.write(s);
        bw.flush();
        bw.close();
        fw.close();

    }

    /**
     * 缓冲字符流复制文件
     */
    public static void copyFile()throws Exception{

        BufferedReader br=new BufferedReader(new FileReader("F:\\javaStudy\\src\\day5\\tt3.txt"));

        BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\javaStudy\\src\\day5\\tt4.txt"));

        char[] c=new char[100];
        int len=0;
        while((len=br.read(c))!=-1){
            bw.write(c,0,len);
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
