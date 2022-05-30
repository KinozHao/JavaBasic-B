package d_generics.dao_test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author kinoz
 * @Date 2022/5/27 - 21:13
 * @apiNote 对数据操作的测试类
 */
public class DaoTest {
    public static void main(String[] args) {
        DataAO<User> uda = new DataAO<User>();
        uda.add("001",new User("人事",31,"Mark"));
        uda.add("002",new User("人事",45,"Jason"));
        uda.add("056",new User("运维",23,"Jerry"));
        uda.add("045",new User("开发",40,"Levis"));
        //相当于把Levis给替换了
        uda.update("045",new User("开发",22,"Nia.Lee"));
        uda.reomve("002");
        List<User> list = uda.list();
        //集合元素类型 局部变量:集合对象
        for (User u : list){
            System.out.println(u);
        }
    }
}
