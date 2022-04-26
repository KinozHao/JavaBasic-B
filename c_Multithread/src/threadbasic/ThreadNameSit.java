package threadbasic;
//Thread设置名称的三种方式
public class ThreadNameSit {
    public static void main(String[] args) {
        methodOBJ();
        methodGTST();
        methodConstruct();
    }

    private static void methodOBJ() {
        Thread so =new  Thread(){
            @Override
            public void run() {
                System.out.println("对象设置名称: " + this.getName());
            }
        };
        so.setName("吕威");
        so.start();
    }

    private static void methodGTST() {
        new Thread(){
            @Override
            public void run() {
                setName("陈子洋");
                System.out.println("getter,setter方法设置名称: " + this.getName());
            }
        }.start();
    }

    private static void methodConstruct() {
        new Thread("成周周"){
            @Override
            public void run() {
                System.out.println("构造器设置名称: "+this.getName());
            }
        }.start();
    }
}