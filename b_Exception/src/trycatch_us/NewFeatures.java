package trycatch_us;

/** @apiNote jdk1.7新特征
1. 不用写多个catch只需要在多个异常中间加 | 即可实现包裹多个异常
2. 前期不推荐这样写，易混淆，建议一个异常对应一个catch包
3. 后期根据需求写法:
4. 安卓,客户端开发,处理异常一般用try{}catch(Exception e){}
5. EE，服务器开发,一般都是用底层开发,从底层向上抛
*/
public class NewFeatures {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int [] arr={11,22,33};

        try {
            System.out.println(a/b);
            System.out.println(arr[5]);
        //}catch (Exception e){       //所有异常的父类就是Exception
        }catch (ArithmeticException  | ArrayIndexOutOfBoundsException E){
            System.out.println("Software error");
        }finally {
            System.out.println("逻辑存在一定问题，请再次检查代码");
        }
    }
}
