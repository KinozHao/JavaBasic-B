package object_us.geometrictest;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/8 - 20:03
 * @apiNote 多态的体现 以及Junit单元测试的使用
 */
public class GeometricTest{
    @Test
    public void colorTest(){
        Circle c1 = new Circle("brow");
        Circle c2 = new Circle("brow");
        //判断颜色是否相等  一定要先获取颜色再去equals进行比较
        System.out.println("c1和c2的颜色相同吗?"+c1.getColor().equals(c2.getColor()));

    }
    Circle c1 = new Circle(4.0);
    Circle c2 = new Circle(3.0);
    @Test
    public void areaTest(){
        GeometricTest gts = new GeometricTest();

        gts.showArea(c1);
        gts.showArea(c2);

        //判断面积是否相等
        boolean isEquals = gts.equalsArea(c1,c2);
        System.out.println("c1和c2的面积相等吗"+isEquals);

    }

    @Test
    public void equalsAndToStringTest(){

        //重写的equals方法就是比较radius所以说不需要get方法了
        System.out.println("c1和c2的半径相同吗?"+c1.equals(c2));

        //重写了toString后返回属性而不是地址值了
        System.out.println(c1);
        System.out.println(c2);
    }


    //判断两个矩形的面积是否相同
    public boolean equalsArea(GeometricObject gto1, GeometricObject gto2){
        return  gto1.findArea() == gto2.findArea();
    }

    //显示对象的面积
    public void  showArea(GeometricObject got){
        System.out.println("面积是："+got.findArea());
    }

}
