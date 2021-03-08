package day7;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 通过实现Runnable接口方式实现多线程
 * @date 2021/3/8 20:54
 */
public class TestRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("多线程运行的代码");
        for(int i=0;i<5;i++){
            System.out.println("这是Runnable多线程的逻辑代码"+i);
        }
    }
}
