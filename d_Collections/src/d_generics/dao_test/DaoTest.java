package d_generics.dao_test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author kinoz
 * @Date 2022/5/27 - 21:13
 * @apiNote �����ݲ����Ĳ�����
 */
public class DaoTest {
    public static void main(String[] args) {
        DataAO<User> uda = new DataAO<User>();
        uda.add("001",new User("����",31,"Mark"));
        uda.add("002",new User("����",45,"Jason"));
        uda.add("056",new User("��ά",23,"Jerry"));
        uda.add("045",new User("����",40,"Levis"));
        //�൱�ڰ�Levis���滻��
        uda.update("045",new User("����",22,"Nia.Lee"));
        uda.reomve("002");
        List<User> list = uda.list();
        //����Ԫ������ �ֲ�����:���϶���
        for (User u : list){
            System.out.println(u);
        }
    }
}
