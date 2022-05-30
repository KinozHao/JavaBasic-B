package d_generics.generic_test;

/**
 * @author kinoz
 * @Date 2022/5/29 - 10:25
 * @apiNote 此类用于通配符的测试
 * @see d_generics.WildCard
 * @see Datas
 */
public class wcData extends Datas{
    public wcData(){

    }
    public wcData(String name, int age) {
        super(name, age);
    }
}