package re_get;

import org.junit.Test;
import re_basic.ReData;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


/**
 * @author kinoz
 * @Date 2022/6/18 - 16:18
 * @apiNote 获取自定义类的所有属性结构
 * @see ReData
 */
public class FieldGet {
    @Test
    public void allFiled(){
        //获取属性结构 当前运行时类和父类public权限的属性
        Class<ReData> dt = ReData.class;
        Field[] fields = dt.getFields();
        for (Field f : fields){
            System.out.println(f);
        }
        System.out.println("----------------------");
        //当前运行时类的所有属性(不包含父类声明的属性)
        Field[] dfs = dt.getDeclaredFields();
        for (Field f1 : dfs){
            System.out.println(f1);
        }
    }

    @Test
    public void separate() {
        //分别获取指定的单个结构体
        Class dt = ReData.class;
        Field[] dfs = dt.getDeclaredFields();

        for (Field f1 : dfs){
            //1.权限修饰符
            int modifier = f1.getModifiers();
            //通过Modifier类把数值转换为修饰符的字母
            System.out.print(Modifier.toString(modifier)+"\t");

            //2.数据类型
            Class<?> type = f1.getType();
            System.out.print(type+"\t");

            //3.变量名
            String name = f1.getName();
            System.out.print(name);
            System.out.println();
        }
    }
}
