package t_dynamic_proxy;

/**
 * @author kinoz
 * @Date 2022/7/21 - 10:57
 * @apiNote
 */ //被代理类
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
