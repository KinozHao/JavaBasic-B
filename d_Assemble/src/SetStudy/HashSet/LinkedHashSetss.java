package SetStudy.HashSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
/** @apiNote LinkedHashSet���ص�
    �ײ�Ϊ����ʵ�� set������Ψһһ���ܱ�֤��ô�����ôȡ�ļ��϶���
    ΪHashSet������,���Ա�֤��Ԫ�ص�Ψһ,��HashSetԭ��һ��
*/
public class LinkedHashSetss {
    public static void main(String[] args) {
        HashSet<String> s = new LinkedHashSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("g");

        System.out.println(s);
    }
}


