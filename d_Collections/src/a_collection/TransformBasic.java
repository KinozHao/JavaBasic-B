package a_collection;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/5/14 - 22:20
 * @apiNote 数组 <--> 集合
 */
public class TransformBasic {
    @Test
    public void ListToArray(){
        ArrayList arr = new ArrayList();
        arr.add("H");
        arr.add("i");
        Object[] obj = arr.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i]+"、");
        }
    }
    @Test
    public void ArrayToList(){
        List<String> asList = Arrays.asList(new String[]{"a", "B", "c"});
        System.out.println(asList);

        List ints = Arrays.asList(new int[]{111, 442});
        //此写法数组会被作为一个元素转换为集合
        System.out.println(ints.size());    //长度判断为1

        //使用包装类即可解决~
        List integers = Arrays.asList(new Integer[]{111, 442});
        System.out.println(integers.size());
    }
}
