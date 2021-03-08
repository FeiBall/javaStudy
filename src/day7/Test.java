package day7;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/8 20:36
 */
public class Test {
    public static void main(String[] args) {
//        Thread t0=new TestThread();//对象的多态
//        t0.start();//启动线程,开始运行run方法中的代码
//
//        Thread t1=new TestThread();//对象的多态
//        t1.start();//启动线程,开始运行run方法中的代码
//
//        Thread t2=new TestThread();//对象的多态
//        t2.start();//启动线程,开始运行run方法中的代码


        Thread t3=new Thread(new TestRunnable());
        t3.start();

        Thread t4=new Thread(new TestRunnable(),"t-1");
        t4.start();




        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");

    }
}
