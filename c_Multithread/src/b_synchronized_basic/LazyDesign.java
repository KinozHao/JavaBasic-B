package b_synchronized_basic;

/**
 * @author kinoz
 * @Date 2022/4/29 - 15:24
 * @apiNote ����ʽ�̰߳�ȫ
 */
public class LazyDesign {
    private LazyDesign(){

    }
    //��ʱinstance���൱�ڹ�������
    private static LazyDesign instance = null;

    public static LazyDesign getInstance(){
        //д��һ:Ч�ʽϲ�
        /*synchronized (HungryDesign.class) {
            if (instance == null){
                instance = new HungryDesign();
            }
            return instance;
        }*/
        //д����:���Ч��
        //��ʱ�̶߳��ɽ���
        if (instance == null){
            synchronized (LazyDesign.class) {
                //��������new�ã����if����100%false �����߳̾������ٽ��룬�ٳ�ȥ
                if (instance == null){
                    instance = new LazyDesign();
                }
            }
        }
        return instance;
    }
}
//��ϰ����ʽд�� ����ʽ���̰߳�ȫ��
class Hungry{
    private Hungry(){

    }
    private final static Hungry instanceH = new Hungry();
    public static Hungry getHungryInstance(){
        return instanceH;
    }
}
