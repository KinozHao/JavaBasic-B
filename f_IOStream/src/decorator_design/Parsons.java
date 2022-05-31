package decorator_design;

/**
 * @author kinoz
 * @Date 2022/5/31 - 15:49
 * @apiNote
 */
class Parsons implements Stander {
    //获取被装饰类的引用
    private AsiaHuman AHN;

    //在构造方法中初始被装饰类的对象
    public Parsons(AsiaHuman AHN) {
        this.AHN = AHN;
    }

    //对原有对象的功能进行升级
    @Override
    public void info() {
        AHN.info();
        System.out.println("Very Smart");
    }
}
