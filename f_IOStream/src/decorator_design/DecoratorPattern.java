package decorator_design;
/**
 * @author kinoz
 * @Date 2022/5/31 - 15:20
 * @apiNote װ�����ģʽ�ĺô��� ����Բ�ǿ,��װ�ε���仯��װ����ı仯�޹�
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Parsons data = new Parsons(new AsiaHuman());
        data.info();
    }
}

