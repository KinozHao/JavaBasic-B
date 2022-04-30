package d_thread_test.product;

/**
 * @author kinoz
 * @Date 2022/4/30 - 15:33
 * @apiNote 厂家只负责生产商品
 */
public class Maker extends Thread {
    private Shopper shopper;

    public Maker(Shopper shopper) {
        this.shopper = shopper;
    }

    @Override
    public void run() {
        System.out.println(getName()+"开始生产...");
        while (true) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                shopper.produceProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
