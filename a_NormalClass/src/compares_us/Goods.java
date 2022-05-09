package compares_us;

/**
 * @author kinoz
 * @Date 2022/5/9 - 20:16
 * @apiNote 货物类 商品的价钱和名称
 * 自然排序
 * 自定义类若需要比较就需要实例Comparable接口重写compareTo()
 */
public class Goods implements Comparable {
    private String name;
    private double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name+" "+price+"￥";
    }
    //按照价格从低到高，产品名称从高到低
    @Override
    public int compareTo(Object o){
        if (o instanceof Goods){
            Goods goods = (Goods)o;
            //当前对象大于形参 输出正数
            if (this.price > goods.price){
                return 1;
                //当前对象小于形参 输出负数
            }else if (this.price < goods.price){
                return -1;
            }else {
                //若存在相同价钱 用名称字母进行比较来排序
                //默认为从低到高进行排序 加个-就是反向操作
                return -this.name.compareTo(goods.name);
            }
        }
        throw new RuntimeException("类型不一致");
    }
}
