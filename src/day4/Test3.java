package day4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/5 0:24
 */
public class Test3 {
    public static void main(String[] args) {
        Test3.testFileReader("D:/test/abc/tt1.txt");

        Test3.testFileWriter("hello","D:/test/abc/tt5.txt");

        Test3.copyFile("D:/test/abc/tt5.txt","D:/test/abc/cc/tt5.txt");
    }


    /**
     * 文件字符输入流
     */
    public static void testFileReader(String inPath){
        try{
            FileReader fr=new FileReader(inPath);//创建文件字符输入流的对象

            char[] c=new char[10];//创建临时存放数据的数组
            int len=0;
            while((len=fr.read(c))!=-1){
                System.out.println(new String(c,0,len));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    /**
     * 文件字符输出流
     * @param text 输出的内容
     * @param outPath 输出的文件
     */
    public static void testFileWriter(String text,String outPath){
        try{

            FileWriter fw=new FileWriter(outPath);
            fw.write(text);//写到内存中
            fw.flush();//内存数据刷到硬盘
            fw.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 字符流完成复制文件，只能拷贝内容是字符的文件
     * @param inPath 被复制的文件
     * @param outPath 输出文件
     */
    public static void copyFile(String inPath,String outPath){
        try{
            File file;
            FileReader fr=new FileReader(inPath);
            FileWriter fw=new FileWriter(outPath);

            char[] c=new char[100];
            int len=0;
            while((len=fr.read(c))!=-1){//读取数据
                fw.write(c,0,len);//写入数据
            }
            fw.flush();//刷到硬盘

            fw.close();
            fr.close();
        }catch (Exception  e){
            e.printStackTrace();
        }

    }



}
