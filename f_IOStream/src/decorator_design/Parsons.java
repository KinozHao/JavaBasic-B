package decorator_design;

/**
 * @author kinoz
 * @Date 2022/5/31 - 15:49
 * @apiNote
 */
class Parsons implements Stander {
    //��ȡ��װ���������
    private AsiaHuman AHN;

    //�ڹ��췽���г�ʼ��װ����Ķ���
    public Parsons(AsiaHuman AHN) {
        this.AHN = AHN;
    }

    //��ԭ�ж���Ĺ��ܽ�������
    @Override
    public void info() {
        AHN.info();
        System.out.println("Very Smart");
    }
}
