/**
 * @author kinoz
 * @Date 2022/4/26 - 19:18
 * @apiNote 实现多线程的方式1:继承Thread类
 */
//1:继承Thread类
class ThreadBasic extends Thread{
    //2:重写Thread方法
    @Override
    public synchronized void run() {
        //输出100以内偶数
        for (int i = 0; i < 100; i++) {
          if (i % 2 == 0 ){
              System.out.println(i);
          }else if (i == 1){
              //强制结束此线程
              //stop();
          }
        }
    }
    //创建方法和调用方法相当于是main方法做的
    //实际里面运行的数据就是我们自己new的线程去做了
    public static void main(String[] args) {
        //3:创建Thread子类对象
        Thread tbc = new ThreadBasic();
        //4:开启此线程
        tbc.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main方法输出");
        }
    }
}
