package compares_us;

/**
 * @author kinoz
 * @Date 2022/5/9 - 20:16
 * @apiNote ������ ��Ʒ�ļ�Ǯ������
 * ��Ȼ����
 * �Զ���������Ҫ�ȽϾ���Ҫʵ��Comparable�ӿ���дcompareTo()
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
        return name+" "+price+"��";
    }
    //���ռ۸�ӵ͵��ߣ���Ʒ���ƴӸߵ���
    @Override
    public int compareTo(Object o){
        if (o instanceof Goods){
            Goods goods = (Goods)o;
            //��ǰ��������β� �������
            if (this.price > goods.price){
                return 1;
                //��ǰ����С���β� �������
            }else if (this.price < goods.price){
                return -1;
            }else {
                //��������ͬ��Ǯ ��������ĸ���бȽ�������
                //Ĭ��Ϊ�ӵ͵��߽������� �Ӹ�-���Ƿ������
                return -this.name.compareTo(goods.name);
            }
        }
        throw new RuntimeException("���Ͳ�һ��");
    }
}
