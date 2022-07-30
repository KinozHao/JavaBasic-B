package t_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author kinoz
 * @Date 2022/6/21 - 9:41
 * @apiNote 动态代理在反射中的体现
 */
class ProxyFactory{
    public static void main(String[] args) {
        //被代理类对象
        Human superMan = new SuperMan();

        //代理类对象
        Human human = (Human)ProxyFactory.getProxyInstance(superMan);
        System.out.println(human.getBelief());
    }

    //1.调用此方法返回一个代理类对象
    public static Object getProxyInstance(Object obj){
        ClassLoader clr = obj.getClass().getClassLoader();
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        HumanProxy hpy = new HumanProxy();
        hpy.bind(obj);

        return Proxy.newProxyInstance(clr, interfaces, hpy);
    }
}
class HumanProxy implements InvocationHandler{
    private Object obj;
    public void bind(Object obj){
        this.obj = obj;
    }
    //通过代理类对象调用方法a时,就会自动调用如下invoke()
    //把被代理类要执行的方法a就声明在invoke()里
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //此method即为代理对象调用的方法,也作为被代理对象要调用的方法
        //result:被代理类的对象
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
