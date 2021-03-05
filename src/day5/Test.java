package day5;

import java.io.*;


/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/5 12:51
 */
public class Test {
    public static void main(String[] args) throws Exception {
        try{
            Test.testBufferedInputStream();
            Test.testBufferedOutputStream();
            Test.copyFile();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 缓冲字节输入流
     */
    public static void testBufferedInputStream() throws Exception {
        //文件字节输入流对象
        FileInputStream in=new FileInputStream("F:\\javaStudy\\src\\day5\\tt.txt");

        //把文件字节输入流放到缓冲字节输入流对象
        BufferedInputStream br=new BufferedInputStream(in);

        byte[] b=new byte[1000];
        int len=0;

        while((len=br.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }

        br.close();
        in.close();
    }

    /**
     * 缓冲字节输出流
     * @throws Exception
     */
    public static void testBufferedOutputStream() throws Exception {

        //创建字节输出对象
        FileOutputStream out=new FileOutputStream("F:\\javaStudy\\src\\day5\\tt11.txt");

        //把字节输出流对象放到缓冲字节输出流中
        BufferedOutputStream bo=new BufferedOutputStream(out);
        String s="hello world";
        bo.write(s.getBytes());//写到内存中
        bo.flush();
        bo.close();
        out.close();

    }


    /**
     * 缓冲实现文件复制
     */
    public static void copyFile() throws Exception {
        //缓冲输入流
        BufferedInputStream br =new BufferedInputStream(new FileInputStream("F:\\javaStudy\\src\\day5\\tt11.txt"));

        //缓冲输出流
        File file;
        BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream("F:\\javaStudy\\src\\day5\\tt12.txt"));

        byte[] b=new byte[100];
        int len=0;
        while((len=br.read(b))!=-1){
            bo.write(b,0,len);//写到内存中
        }
        bo.flush();
        bo.close();
        br.close();

    }

}



