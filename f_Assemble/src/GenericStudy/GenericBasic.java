package GenericStudy;
import java.util.ArrayList;
import java.util.List;
/** @apiNote
 * û�з��͵ı׶�
 * �����Ҫ�洢��10��Ӣ��
 * ���1��������ʱ��ͺ��鷳
 * ��������Ҫ����ǿת�ſ���ʹ��
 * ʱ�䳤�˿��ܼǲ������ʲô���͵Ķ�����
 * */
public class GenericBasic {
        public static void main(String[] args) {
            WithGeneric();
            NoneGeneric();
        }

    private static void NoneGeneric() {

        List all = new ArrayList();
        all.add(new LolView("��ʥ"));
        all.add("��ʥ����");
        System.out.println(all);

    }

    private static void WithGeneric() {
        //�涨�˷�������ΪLOLView��ֻ��д����涨�Ĳ���
        List<LolView> lol = new ArrayList<>();
        lol.add(new LolView("��Ī","��Һ���"));
        //lol.add("�󿳵�");
        System.out.println(lol);
    }
}
