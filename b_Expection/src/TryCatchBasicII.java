public class TryCatchBasicII {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int [] arr={11,22,33};
        /*jdk1.7之后的新特征 不用写多个catch 只需要在多个异常中间加|即可实现包裹多个异常
            但是前期不推荐这种写法 多了容易混淆 还是有什么异常写一个catch包裹
            后期经验根据需求有两种写法:
            安卓,客户端开发,处理异常一般用 try{}catch(Exception e){}
            ee,服务器开发,一般都是用底层开发,从底层向上抛
        */
        try {
            System.out.println(a/b);
            System.out.println(arr[5]);
//      }catch (Exception e){       //所有异常的父类就是Exception
        }catch (ArithmeticException  | ArrayIndexOutOfBoundsException E){
            System.out.println("Software error");
        }
    }
}
