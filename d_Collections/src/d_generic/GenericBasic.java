package d_generic;

import org.junit.Test;
import z_tools.CollTraver;
import java.util.Vector;

/** @apiNote
 * 让一个集合只存储一种数据类型的数据
 * Generic是一种规范
 * */
public class GenericBasic {
    @Test
    public void WithGeneric() {
        Vector<String> vector = new Vector();
        vector.add("俺的圣剑");
        vector.add("信息学院");
        vector.add("机械学院");
        //vector.add(25.34); 泛型指定类型为String就只能添加String类型的数据
        CollTraver.IteratorTravers(vector);
    }
}
