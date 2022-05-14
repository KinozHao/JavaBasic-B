package a_collection;

import org.junit.Test;

import java.lang.annotation.Target;
import java.util.ArrayList;

/**
 * @author kinoz
 * @Date 2022/5/14 - 22:20
 * @apiNote 数组与集合之间的转换
 */
public class TransformBasic {
    @Test
    public void ListToArray(){
        ArrayList arr = new ArrayList();
        arr.add("H");
        arr.add("E");
        arr.add("L");
        arr.add("L");
        arr.add("O");
        Object[] obj = arr.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i]+"、");
        }
    }
}
