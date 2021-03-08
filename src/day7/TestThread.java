package day7;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 继承Thread的方式实现多线程
 * @date 2021/3/8 20:37
 */
public class TestThread extends Thread {
    @Override
    public void run(){
        System.out.println("多线程运行的代码");
        for(int i=0;i<5;i++){
            System.out.println("这是多线程的逻辑代码"+i);
        }

    }
}
