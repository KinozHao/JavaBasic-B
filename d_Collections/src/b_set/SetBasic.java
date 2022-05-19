package b_set;
import org.junit.Test;
import z_tools.CollTraver;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
/** @apiNote LinkedHashSetΪHashSet������
    �ײ�Ϊ˫�������ܱ�֤��ô�����ôȡ
*/
public class SetBasic {
    @Test
    public void Normal() {
        HashSet s = new HashSet();
        s.add("a");
        s.add(34);
        s.add("c");
        s.add(34.74322);
        /*������д��hashCode��ֻ�ܴ���һ��
        ��ӵ�Ԫ�ذ���equals�ж�ʱ�����ɷ���true*/
        s.add(new SetData("�ǰͿ�",1990));
        s.add(new SetData("�ǰͿ�",1990));
        Iterator iterator = s.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

    }
    @Test
    public void NormalII(){
        //LinkedHashSetΪHashSet������
        //�������õ�����
        //���Ϊ�����Ǽ��� ֻ����Ϊ�洢������ͬʱά������������ ������ǰ������
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(323);
        lhs.add(new SetData("Jack",25));
        lhs.add(new BigInteger("3245223242352523523525236422"));
        lhs.add(29.64345432344242);
        CollTraver.IteratorTravers(lhs);
    }
}


