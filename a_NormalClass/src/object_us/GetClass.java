package object_us;

/**
 * @author kinoz
 * @date 2022/4/9 - 17:53
 * @apiNote getClass�Լ�getSuperclass��ʹ��
 */


public class GetClass {
    public static void main(String[] args) {
        StudentList studentList =new StudentList("xiaohuia",13);
        //��ȡ�������
        System.out.println(studentList.getClass());
        //��ȡ����ĸ���
        System.out.println(studentList.getClass().getSuperclass());
    }
}
