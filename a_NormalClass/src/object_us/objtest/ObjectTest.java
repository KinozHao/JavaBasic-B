package object_us.objtest;

import object_us.objtest.Order;

/**
 * @author kinoz
 * @date 2022/4/9 - 17:53
 * @apiNote object类的概述
 */
public class ObjectTest {
    public static void main(String[] args) {
        Order order = new Order(30,"明");
        Order orders = new Order(30,"暗");
        System.out.println(order.equals(orders));

        //获取Order类的父类参数
        System.out.println(order.getClass().getSuperclass());
    }
}

