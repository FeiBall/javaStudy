package day5;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/5 19:41
 */

import java.io.*;

/**
 * 序列化与反序列化
 * 注意：对象的序列化与反序列化的使用的类要严格一致，包名，类名，类机构等等所有都要一致
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        Test3.testSerialize();
        Test3.testDeserialize();

    }

    /**
     * 对象的序列化
     */
    public static void testSerialize() throws Exception {

        //定义对象的输出流，把对象序列化之后的流放到指定的文件中
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("F:\\javaStudy\\src\\day5\\tt9.txt"));

        Person p=new Person();
        p.name="zhangsan";
        p.age=11;

        out.writeObject(p);
        out.flush();
        out.close();

    }

    /**
     * 对象的反序列化
     */
    public static void testDeserialize()throws Exception{

        //创建对象输入流，从指定的文件中把独享序列化的流读取出来
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("F:\\javaStudy\\src\\day5\\tt9.txt"));

        Object obj=in.readObject();
        Person p=(Person)obj;

        System.out.println(p.age);
        System.out.println(p.name);

    }

}
