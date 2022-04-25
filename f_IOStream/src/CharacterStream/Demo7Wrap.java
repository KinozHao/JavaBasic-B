package CharacterStream;

public class Demo7Wrap {
    public static void main(String[] args) {
        HMstudent hms=new HMstudent(new kinoz());
        hms.code();
    }
}
interface code{
    public void code();
}
//装饰设计模式的好处是 耦合性不强,被装饰的类变化和装饰类的变化无关
class kinoz implements code{

    @Override
    public void code() {
        System.out.println("javase");
        System.out.println("javaweb");
    }
}
class HMstudent implements code{
    //获取被装饰类的引用
    private kinoz k;

    //在构造方法中初始被装饰类的对象
    public HMstudent(kinoz k) {
        this.k = k;
    }

    //对原有对象的功能进行升级
    @Override
    public void code() {
        k.code();
        System.out.println("AI");
        System.out.println("Python");
        System.out.println("...");
    }
}