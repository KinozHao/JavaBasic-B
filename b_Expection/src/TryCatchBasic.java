public class TryCatchBasic {
    public static void main(String[] args) {
        try {
            int x = TryCatchBasic.div(0, 0);
            System.out.println(x);
        } catch (ArithmeticException a) {
            System.out.println("Get some error");
        }

    }
    public static int div(int a,int b){
        return a / b;
    }
}
