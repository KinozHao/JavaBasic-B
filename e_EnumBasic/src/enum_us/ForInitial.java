package enum_us;

import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/5/12 - 17:14
 * @apiNote 枚举类初始化测试
 */
public class ForInitial {
    @Test
    public void EnumTest(){
        //自定义枚举类
        UserEnum user = UserEnum.AUTUMN;
        System.out.println(user);
        //使用Enum关键词
        SysEnum sys = SysEnum.HIGH;
        System.out.println(sys);
        //枚举类每个常量都可重写接口方法
        sys.show();
    }
    @Test
    //三个常用方法
    public void EnumMethod(){
        //1.toString()
        System.out.println(SysEnum.HIGH);

        //2.values() 所有定义过的常量名
        SysEnum[] val = SysEnum.values();
        for (int i = 0; i < val.length; i++) {
            System.out.println(val[i]);
            //枚举类每个常量都可重写接口方法
            val[i].show();
        }
        //Thread类中的State也是Enum
        Thread.State[] tval = Thread.State.values();
        for (int s = 0; s < tval.length; s++) {
            System.out.println(tval[s]);
        }

        //3.valueOf 查找指定名的常量
        SysEnum di = SysEnum.valueOf("LOW");
        System.out.println(di);
    }
}
