package Thread学习;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/16 22:11
 */
public class FetchMoney {

    public static void main(String[] args) {
        /**
         * ATM取钱
         */
        class AtmFetchMoney extends Thread {
            private Bank bank;
            public AtmFetchMoney(Bank bank) {
                this.bank = bank;
            }
            @Override
            public void run() {
                System.out.println("ATM取钱:" + bank.getMoney(800));
            }
        }

        /**
         * 柜台取钱
         */
        class GuiTaiFetchMoney extends Thread {
            private Bank bank;
            public GuiTaiFetchMoney(Bank bank) {
                this.bank = bank;
            }
            @Override
            public void run() {
                System.out.println("柜台取钱:" + bank.getMoney(800));
            }
        }

        /**
         * 模拟取钱过程,两个线程同时对一个账户进行操作。
         */
        Bank bank = new Bank();
        Thread t1 = new AtmFetchMoney(bank);
        Thread t2 = new GuiTaiFetchMoney(bank);
        t1.start();
        t2.start();
    }

}
