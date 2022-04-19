public class TryCatchBasic {
    public static void main(String[] args) {
        demo s=new demo();
        try {
            int x=s.div(10,0);
            System.out.println(x);
        }catch (ArithmeticException a) {
            System.out.println("Get some error");
        }

    }
}
class demo{
    public int div(int a,int b){

        return a / b;
    }

}
