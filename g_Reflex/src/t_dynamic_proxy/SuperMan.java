package t_dynamic_proxy;

/**
 * @author kinoz
 * @Date 2022/7/21 - 10:57
 * @apiNote
 */ //��������
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "��������";
    }

    @Override
    public void eat(String food) {
        System.out.println("��ϲ����"+food);
    }
}
