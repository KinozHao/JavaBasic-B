package d_generics;

/**
* @author kinoz
* @Date 2022/5/29 - 9:30
* @apiNote
*正则表达式
需求 FB账号校验
1:需求必须是5-15位数字
2:0不能为开头
3:必须都是数字
*/
public class RegularUs {
    public static void main(String[] args) {
        //2.正则检验法
        String regex="[1-9]\\d{4,14}";
        System.out.println("18557903842".matches(regex));

        System.out.println(VerifyAccount("124322335"));   //符合要求
        System.out.println(VerifyAccount("0232323232"));  //不符合要求0开头
    }

    //1.Java方法实现
    public static boolean VerifyAccount(String phoneNums){
        boolean flag=true;
        if (phoneNums.length()>=5 && phoneNums.length()<=15){ //fb的索引在5-15内正常 否则返回false
            if (!phoneNums.startsWith("0")){           //fb开头不为0正常,否则false
                char [] arr=phoneNums.toCharArray();   //字符串转换为字符数组
                for (int i = 0; i < arr.length; i++) {  //数组遍历
                    char cr=arr[i];             //记录遍历的结果
                    if (cr>='0' && cr<='9'){

                    }else{
                        flag=false;
                    }
                }
            }else{
                flag=false;
            }
        }else {
            flag=false;
        }
            return flag;
    }
}
