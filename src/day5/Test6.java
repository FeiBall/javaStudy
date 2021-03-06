package day5;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/5 21:27
 */

import java.io.RandomAccessFile;

/**
 * 文件的随机读写
 * 程序可以直接跳到文件的任意地方来读写文件
 */
public class Test6 {
    public static void main(String[] args) throws Exception{
        Test6.testRandomAccessFileRead();
        Test6.testRandomAccessFileWrite();

    }

    /**
     * 随机读文件
     */
    public static void testRandomAccessFileRead()throws Exception{
        //RandomAccessFile的构造有个参数，参数一是文件路径，参数2是指定访问模式
        RandomAccessFile ra=new RandomAccessFile("F:\\javaStudy\\src\\day5\\tt12.txt", "r");

        ra.seek(13);//文件读取的起始位置
        byte[] b=new byte[1024];
        int len=0;
        while((len=ra.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }

    }

    /**
     * 随机写文件
     */
    public static void testRandomAccessFileWrite()throws Exception{
        RandomAccessFile ra=new RandomAccessFile("F:\\javaStudy\\src\\day5\\tt12.txt", "rw");
        ra.seek(5);//设置写的起始点,代表从开头写
        //ra.seek(ra.length());//设置写的起始点，代表从末尾写

        ra.write("你好".getBytes());
        ra.close();

    }
}
