package MapStudy.TreeMapStudy;

public class MapEntry�Ľ��� {
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
class c implements a.b{    //��һ���ӿ�.һ���ӿڵ�ʱ���˵������Ľӿ���ǰ��ӿڵ��ڲ��ӿ�
    @Override
    public void method() {
        System.out.println("hello world");
    }
}
