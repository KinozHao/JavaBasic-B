package decorator_design;

/**
 * @author kinoz
 * @Date 2022/5/31 - 15:49
 * @apiNote ��Ϊ��װ����
 */
class AsiaHuman implements Stander {
    @Override
    public void info() {
        System.out.println("Black Eyes");
        System.out.println("Yellow Skin");
    }
}
