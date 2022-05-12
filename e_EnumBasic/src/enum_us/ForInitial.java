package enum_us;

import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/5/12 - 17:14
 * @apiNote ö�����ʼ������
 */
public class ForInitial {
    @Test
    public void EnumTest(){
        //�Զ���ö����
        UserEnum user = UserEnum.AUTUMN;
        System.out.println(user);
        //ʹ��Enum�ؼ���
        SysEnum sys = SysEnum.HIGH;
        System.out.println(sys);
        //ö����ÿ������������д�ӿڷ���
        sys.show();
    }
    @Test
    //�������÷���
    public void EnumMethod(){
        //1.toString()
        System.out.println(SysEnum.HIGH);

        //2.values() ���ж�����ĳ�����
        SysEnum[] val = SysEnum.values();
        for (int i = 0; i < val.length; i++) {
            System.out.println(val[i]);
            //ö����ÿ������������д�ӿڷ���
            val[i].show();
        }
        //Thread���е�StateҲ��Enum
        Thread.State[] tval = Thread.State.values();
        for (int s = 0; s < tval.length; s++) {
            System.out.println(tval[s]);
        }

        //3.valueOf ����ָ�����ĳ���
        SysEnum di = SysEnum.valueOf("LOW");
        System.out.println(di);
    }
}
