package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 两个线程交替打印打印 0-100 的奇数和偶数
 * @date 2021/3/15 5:45
 */
public class ThreadTest {
    public boolean flag;
    public class OddClass implements Runnable {
        public ThreadTest t;
        public OddClass(ThreadTest t) {
            this.t = t;
        }

        @Override
        public void run() {
            int i = 1;  //本线程打印奇数,则从1开始
            while (i < 100) {
                synchronized (t) {
                    if (!t.flag) {
                        System.out.println("奇数：" + i);
                        i += 2;
                        t.flag = true;
                        t.notify();
                    } else {
                        try {
                            t.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        }
    }


    public class EvenClass implements Runnable {
        public ThreadTest t;
        public EvenClass(ThreadTest t) {
            this.t = t;
        }

        @Override
        public void run() {
            int i = 2;
            while (i <= 100)
                synchronized (t) {
                    if (t.flag) {
                        System.out.println("偶数：" + i);
                        i += 2;
                        t.flag = false;
                        t.notify();
                    } else {
                        try {
                            t.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        }
    }

    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        OddClass jiClass = tt.new OddClass(tt);
        EvenClass ouClass = tt.new EvenClass(tt);
        new Thread(jiClass).start();
        new Thread(ouClass).start();
    }
}

