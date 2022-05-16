package a_collection;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/5/14 - 22:20
 * @apiNote ���� <--> ����
 */
public class TransformBasic {
    @Test
    public void ListToArray(){
        ArrayList arr = new ArrayList();
        arr.add("H");
        arr.add("i");
        Object[] obj = arr.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i]+"��");
        }
    }
    @Test
    public void ArrayToList(){
        List<String> asList = Arrays.asList(new String[]{"a", "B", "c"});
        System.out.println(asList);

        List ints = Arrays.asList(new int[]{111, 442});
        //��д������ᱻ��Ϊһ��Ԫ��ת��Ϊ����
        System.out.println(ints.size());    //�����ж�Ϊ1

        //ʹ�ð�װ�༴�ɽ��~
        List integers = Arrays.asList(new Integer[]{111, 442});
        System.out.println(integers.size());
    }
}
