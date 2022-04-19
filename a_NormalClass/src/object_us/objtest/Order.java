package object_us.objtest;

import java.util.Objects;

/**
 * @author kinoz
 * @date 2022/4/9 - 19:48
 * @apiNote order¿‡ equals¡∑œ∞
 */
public class Order {
    private int orderid;
    private String ordername;

    public Order(int orderid, String ordername) {
        this.orderid = orderid;
        this.ordername = ordername;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderid == order.orderid &&
                Objects.equals(ordername, order.ordername);
    }
}
