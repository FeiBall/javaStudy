package Thread学习;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/16 22:10
 */
public class Bank {
    private int balance = 1000;
    /**
     * 取钱的方法
     * @param number 取钱的金额
     * @return
     */
    public  synchronized  int getMoney(int number) {
        if (number < 0) {
            return -1;
        } else if (number > balance) {
            return -2;
        } else if (balance < 0) {
            return -3;
        } else {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= number;
            System.out.println("balance is:" + balance);
            return number;
        }
    }


}
