package c_processliu;

import java.io.Serializable;

/**
 * @author kinoz
 * @Date 2022/6/5 - 16:45
 * @apiNote 用于对象流使用
 */
public class ObjData implements Serializable{
    //自定义序列化类必须提供序列号
    private static final long serialVersionUID = 66650881222L;

    private int goods_id;
    private String goods_name;
    private double goods_price;

    public ObjData() {
    }

    public ObjData(int goods_id, String goods_name, double goods_price) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_price = goods_price;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(double goods_price) {
        this.goods_price = goods_price;
    }

    @Override
    public String toString() {
        return "ObjData{" +
                "goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", goods_price=" + goods_price +
                '}';
    }
}
