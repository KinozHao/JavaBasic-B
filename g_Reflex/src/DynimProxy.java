import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author kinoz
 * @Date 2022/6/21 - 9:41
 * @apiNote 动态代理在反射中的体现
 */
public class DynimProxy {
    public static void main(String[] args) {
        //被代理类对象
        SuperMan superMan = new SuperMan();
        //代理类对象
        Human human = (Human)ProxyFactory.getProxyInstance(superMan);
        System.out.println(human.getBelief());
        human.eat("美国M9牛排");
    }
}

//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "相信世界";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃"+food);
    }
}

class ProxyFactory{
    //1.调用此方法返回一个代理类对象
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
    //通过代理类对象调用方法a时,就会自动盗用如下invoke()
    //把被代理类要执行的方法a就声明在invoke()里
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //此method即为代理对象调用的方法,也作为被代理对象要调用的方法
        //obj:被代理类的对象
        Object returnValue = method.invoke(obj, args);
        return returnValue;
    }
}