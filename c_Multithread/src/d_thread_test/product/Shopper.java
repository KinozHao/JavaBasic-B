package d_thread_test.product;

/**
 * @author kinoz
 * @Date 2022/4/30 - 15:33
 * @apiNote 实体店铺作为中间共享数据
 */
public class Shopper {
    //商品初始数量
    private int productNum = 0;
    //商品入库(不足时通知工厂生产)
    public synchronized void produceProduct() throws InterruptedException {
        if (productNum < 20){
            productNum++;
            System.out.println(Thread.currentThread().getName()+"开始生产商品"+"第"+productNum+"个");
            notify();
        }else {
            wait();
        }
    }
    //商品出库(客户来购买，缺货时停止销售)
    public synchronized void consumeProduct() throws InterruptedException {
        if (productNum > 0){
            System.out.println(Thread.currentThread().getName()+"购买商品当中"+"第"+productNum+"个");
            productNum--;
            notify();
        }else {
            wait();
        }
    }
}
