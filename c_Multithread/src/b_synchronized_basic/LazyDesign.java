package b_synchronized_basic;

/**
 * @author kinoz
 * @Date 2022/4/29 - 15:24
 * @apiNote 懒汉式线程安全
 */
public class LazyDesign {
    private LazyDesign(){

    }
    //此时instance就相当于共享数据
    private static LazyDesign instance = null;

    public static LazyDesign getInstance(){
        //写法一:效率较差
        /*synchronized (HungryDesign.class) {
            if (instance == null){
                instance = new HungryDesign();
            }
            return instance;
        }*/
        //写法二:提高效率
        //此时线程都可进入
        if (instance == null){
            synchronized (LazyDesign.class) {
                //若对象已new好，外层if就是100%false 其他线程就无需再进入，再出去
                if (instance == null){
                    instance = new LazyDesign();
                }
            }
        }
        return instance;
    }
}
//复习饿汉式写法 饿汉式是线程安全的
class Hungry{
    private Hungry(){

    }
    private final static Hungry instanceH = new Hungry();
    public static Hungry getHungryInstance(){
        return instanceH;
    }
}
