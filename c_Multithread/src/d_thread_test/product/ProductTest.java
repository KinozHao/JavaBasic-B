package d_thread_test.product;

/**
 * @author kinoz
 * @Date 2022/4/30 - 15:33
 * @apiNote 线程安全问题:生产者线程 消费者线程
 * 共享数据:商店 消费者
 * 涉及到同步的使用
 * 涉及线程同步问题
 */
public class ProductTest {
    public static void main(String[] args) {
        //实体店铺作为共享数据
        Shopper shopper = new Shopper();

        //一个生产厂家
        Maker maker = new Maker(shopper);
        maker.setName("生产厂家:");
        maker.start();

        //二个消费者
        Customer customer = new Customer(shopper);
        customer.setName("消费者1:");
        customer.start();
        Customer customer2 = new Customer(shopper);
        customer2.setName("消费者2:");
        customer2.start();
    }
}
