package threadb.tmethod;
//Thread设置名称的三种方式
public class Demo1Thread_Name {
    public static void main(String[] args) {
        Construction();
        gtstmethod();
        Objectss();
    }

    private static void Objectss() {        //把这个线程看作一个对象 调用方法即可
        Thread so =new  Thread(){
            @Override
            public void run() {
                System.out.println("Object method" + this.getName() + ">c");
            }
        };
        so.setName("对象");
        so.start();
    }

    private static void gtstmethod() {  //通过set get方法
        new  Thread(){
            @Override
            public void run() {
                setName("S和G");
                System.out.println("Set and get method" + this.getName() + ">c");
            }
        }.start();
    }

    private static void Construction() {    //构造方法设置名字
        new Thread("构造"){
            @Override
            public void run() {
                System.out.println("Construction method"+this.getName() + ">a");
            }
        }.start();
    }
}
