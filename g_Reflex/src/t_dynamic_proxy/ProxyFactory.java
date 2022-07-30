package t_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author kinoz
 * @Date 2022/6/21 - 9:41
 * @apiNote ��̬�����ڷ����е�����
 */
class ProxyFactory{
    public static void main(String[] args) {
        //�����������
        Human superMan = new SuperMan();

        //���������
        Human human = (Human)ProxyFactory.getProxyInstance(superMan);
        System.out.println(human.getBelief());
    }

    //1.���ô˷�������һ�����������
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
    //ͨ�������������÷���aʱ,�ͻ��Զ���������invoke()
    //�ѱ�������Ҫִ�еķ���a��������invoke()��
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //��method��Ϊ���������õķ���,Ҳ��Ϊ���������Ҫ���õķ���
        //result:��������Ķ���
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
