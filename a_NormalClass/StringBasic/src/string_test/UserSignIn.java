package string_test;

import java.util.Scanner;

/*问题
模拟登陆界面,给三次机会,并提示还有几次
用户名和密码可以自定义
*/
/*思路分析
    1:模拟登陆需要用到键盘录入:Scanner
    2:给三次机会会用到for循环
    3:判断输入进去的字符串是否相同会用到equals方法
    4:因为键盘录入有字符串所以用nextLine方法,不要用nextInt方法
    5:并提示有几次,需要用到判断,i
 */
public class UserSignIn {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter you name:");
        String userName = sc.nextLine();
        System.out.print("Please enter you password");
        String password = sc.nextLine();

        if ("Admin".equals(userName) && "786813".equals(password)){
            System.out.println("Welcome  <"+userName+">  Sign in");
            break;
        }else {
            if (i == 2) {
                System.out.println("You have no chance Try tomorrow");
            } else {
                System.out.println("你输入的有错误 你还剩余" + (2 - i) + " 机会");
            }
            }
        }
    }
}
