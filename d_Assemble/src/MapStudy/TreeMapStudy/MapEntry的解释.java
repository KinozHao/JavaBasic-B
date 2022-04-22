package MapStudy.TreeMapStudy;

public class MapEntry的解释 {
    public static void main(String[] args) {
        c s = new c();
        s.method();
    }
}
interface a{
    interface b{
        void method();
    }
}
class c implements a.b{    //当一个接口.一个接口的时候就说明后面的接口是前面接口的内部接口
    @Override
    public void method() {
        System.out.println("hello world");
    }
}
