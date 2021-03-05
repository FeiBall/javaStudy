package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/4 23:28
 */
public class Tet2 {
    public static void main(String[] args) {
        Tet2.testFileInputStream();
        Tet2.testFileOutputStream();
        Tet2.copyFile("D:/test/abc/tt1.txt","D:/test/abc/cc/tt1.txt");//复制txt文件
        Tet2.copyFile("D:/test/abc/123.png","D:/test/abc/cc/456.png");//复制txt文件

    }

    /**
     * 文件字节输入流FileInputStream
     */

    public static void testFileInputStream(){
        try{
            File file;
            FileInputStream in = new FileInputStream("D:/test/abc/tt1.txt");

            byte[] b=new byte[10];//设置一个byte数组接受读取的文件的内容

            int len=0;
            //           in.read(b);//in.read方法有一个返回值，返回值是读取的文件的长度，如果读取到最后一个数据，然后还会向后读一个，此时返回值是-1
            //也就意味着in.read的返回值是-1时，整个文件也就读完了
            while((len=in.read(b))!=-1){
                System.out.println(new String(b,0,len));
                //new String(b,0,len)参数1是缓冲数据的数组，参数2是起始位置，参数3是总共转换几个字节

            }




            in.close();//注意，流在使用完后一定要关闭

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 文件字节输出流
     */
    public static void testFileOutputStream(){
        try{
            File file;
            FileOutputStream out=new FileOutputStream("D:/test/abc/tt4.txt");//指定向tt4输出数据
            String str="123213adsdsad";
            out.write(str.getBytes());//把数据写到内存
            out.flush();//把内存中的数据刷写到硬盘
            out.close();//关闭流
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * 复制文件到另一个目录
     */
    public static void copyFile(String inPath,String outPath){
        try{
            FileInputStream in=new FileInputStream(inPath);//读取的源文件

            FileOutputStream out=new FileOutputStream(outPath);//复制到那里

            byte[] b=new byte[1000];
            int len=0;
            while((in.read())!=-1){
                out.write(b,0,len);//写道内存
            }
            out.flush();//刷到硬盘
            out.close();
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}


