package d_generic;

import org.junit.Test;
import z_tools.CollTraver;
import java.util.Vector;

/** @apiNote
 * ��һ������ֻ�洢һ���������͵�����
 * Generic��һ�ֹ淶
 * */
public class GenericBasic {
    @Test
    public void WithGeneric() {
        Vector<String> vector = new Vector();
        vector.add("����ʥ��");
        vector.add("��ϢѧԺ");
        vector.add("��еѧԺ");
        //vector.add(25.34); ����ָ������ΪString��ֻ�����String���͵�����
        CollTraver.IteratorTravers(vector);
    }
}
