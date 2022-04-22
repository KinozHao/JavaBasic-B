package GenericStudy;

/*
    正则表达式
    案例要求:
    需求 FB账号校验
    1:需求必须是5-15位数字
    2:0不能为开头
    3:必须都是数字
*/
public class RegularUs {
    public static void main(String[] args) {


        System.out.println(checkFBAccount("124322335"));   //符合要求
        System.out.println(checkFBAccount("0232323232"));  //不符合要求0开头


        String regex="[1-9]\\d{4,14}";
        System.out.println("chinanumber".matches(regex));
    }


    public static boolean checkFBAccount(String fb){
        boolean flag=true;
        if (fb.length()>=5 && fb.length()<=15){ //fb的索引在5-15内正常 否则返回false
            if (!fb.startsWith("0")){           //fb开头不为0正常,否则false
                char [] arr=fb.toCharArray();   //字符串转换为字符数组
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
