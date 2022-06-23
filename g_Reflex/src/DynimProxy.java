import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author kinoz
 * @Date 2022/6/21 - 9:41
 * @apiNote ��̬�����ڷ����е�����
 */
public class DynimProxy {
    public static void main(String[] args) {
        //�����������
        SuperMan superMan = new SuperMan();
        //���������
        Human human = (Human)ProxyFactory.getProxyInstance(superMan);
        System.out.println(human.getBelief());
        human.eat("����M9ţ��");
    }
}

//��������
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

class ProxyFactory{
    //1.���ô˷�������һ�����������
    public static Object getProxyInstance(Object obj){
        MyIHR ihr = new MyIHR();
        ihr.bind(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), ihr);
    }
}
class MyIHR implements InvocationHandler{
    private Object obj;
    public void bind(Object obj){
        this.obj = obj;
    }
    //ͨ�������������÷���aʱ,�ͻ��Զ���������invoke()
    //�ѱ�������Ҫִ�еķ���a��������invoke()��
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //��method��Ϊ���������õķ���,Ҳ��Ϊ���������Ҫ���õķ���
        //obj:��������Ķ���
        Object returnValue = method.invoke(obj, args);
        return returnValue;
    }
}