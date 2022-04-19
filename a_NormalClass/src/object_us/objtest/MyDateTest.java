package object_us.objtest;

/**
 * @author kinoz
 * @date 2022/4/9 - 19:55
 * @apiNote
 */
public class MyDateTest {
    public static void main(String[] args) {
        MyDate me = new MyDate(14,3,2022);
        MyDate me2 = new MyDate(14,3,2022);

        //==比较地址值
        if (me == me2){
            System.out.println("me == me2");
        }else {
            System.out.println("me != me2");
        }

        //重写了equals方法 比较属性
        if (me.equals(me2)){
            System.out.println("me is equals to me2");
        }else {
            System.out.println("me !equals to  me2");
        }
    }
}
