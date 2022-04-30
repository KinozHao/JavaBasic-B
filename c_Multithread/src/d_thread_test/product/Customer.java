package d_thread_test.product;

/**
 * @author kinoz
 * @Date 2022/4/30 - 15:34
 * @apiNote 消费者只负责花钱去买
 */
public class Customer extends Thread {
    private Shopper shopper;

    public Customer(Shopper shopper) {
        this.shopper = shopper;
    }

    @Override
    public void run() {
        System.out.println(getName()+"购买商品...");
        while (true) {
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                shopper.consumeProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
