package GenericStudy;

import java.util.ArrayList;
import java.util.List;

public class ListBasic {
    public static void main(String[] args) {
        //List������һ���ӿ� ֻ��ͨ������ʵ����ȥ�����
        List list = new ArrayList();

        //���һ���Զ�����󵽼�����
        list.add(new LolView("����","������"));

        System.out.println(list);
    }
}
