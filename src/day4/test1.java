package day4;

import java.io.File;
import java.io.IOException;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/4 17:57
 */
public class test1 {
    public static void main(String[] args) {
        File f=new File("D:\\test\\abc\\tt.txt");//此时对象f就是tt.txt文件
        File f4=new File("D:\\test\\abc");//此时对象f就是tt.txt文件
        File f3=new File("D:"+File.separator+"\\test\\abc\\tt.txt");//此时用了File.separator作为文件分隔符
        File f2=new File("D:/test/abc/tt.txt");
//        File f1=new File("D:\\test","abc\\tt.txt");//此时对象f1也tt.txt文件,这种方法用得少

        //注意，在文件中\是分隔符，但在java编程当中，一个\是转义符，而\\或者/才是文件的分隔符

        System.out.println(f.getName());
        System.out.println(f4.getName());

        System.out.println(f.getPath());//获取文件或者文件夹的路径,就是new file时写的路径
        System.out.println(f.getAbsolutePath());//获取文件或者文件夹的绝对路径

        f.renameTo(new File("D:\\test\\abc\\tt1.txt"));//给文件或文件夹重命名

        File f8=new File("D:\\test\\abc\\tt2.txt");//看文件是否存在，不存在就创建一个
        System.out.println(f8.exists());
        if(!f8.exists()){
            try{
                f8.createNewFile();//创建文件
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        //f8.delete();//删除文件
        File f9=new File("D:\\test\\abc\\cc");//创建单级目录
        f9.mkdirs();//只能创建单层目录

        File f10=new File("D:\\test\\abc\\a/b/c");
        f10.mkdirs();//创建多级目录

        File f11=new File("D:/test");//返回当前文件夹的子集，包括目录和文件
        String[] f12=f11.list();
        for(String s:f12){
            System.out.println(s);
        }

    }
}
