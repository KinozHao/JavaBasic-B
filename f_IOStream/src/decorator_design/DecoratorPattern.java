package decorator_design;
/**
 * @author kinoz
 * @Date 2022/5/31 - 15:20
 * @apiNote 装饰设计模式的好处是 耦合性不强,被装饰的类变化和装饰类的变化无关
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Parsons data = new Parsons(new AsiaHuman());
        data.info();
    }
}

