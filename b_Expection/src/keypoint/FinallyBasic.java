package keypoint;

public class FinallyBasic {
    public static void main(String[] args) throws InterruptedException {

        int[] arr = {1, 234, 35};
        try {
            System.out.println(arr[5]);
//            System.exit(0);   如果用了这个语句就不会出现finally语句的 直接结束jvm
        } catch (Exception e) {
            e.printStackTrace();
            return ;
        } finally {
            while (true){
                Thread.sleep(1000);
                System.out.println("老子很牛逼 必须执行");   //finally下的句子必须执行除非特殊情况
            }
        }
    }
}
