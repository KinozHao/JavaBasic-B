package string_method;


import org.junit.Test;
/**
 * @author kinoz
 * @Date 2022/5/3 - 22:26
 * @apiNote 又一堆方法牵扯正则表达式
 */
public class Method_C {
    @Test
    public void replaceMethod() {//替换方法
        //替换指定所有一样字符串
        String s1="NanKingg";
        String s2 = s1.replace("King"," Company");
        //替换指定所有一样char字符
        System.out.println(s2);
        String s3 = s1.replace('g','o');
        System.out.println(s3);

        //全部替换，把数字替换为,牵扯正则表达式
        String str = "nan23zhong32song32";
        System.out.println(str.replaceAll("\\d+",","));
    }

    @Test
    public void matchesMethod(){//matches判断方法
        String str ="123242";
        //判断此字符串是不是全部由数字组成
        System.out.println(str.matches("\\d+"));

        //判断电话号码区号，和后面位数对不对
        String str2 = "0571-4518716";
        System.out.println(str2.matches("0571-\\d{7,8}"));
    }

    @Test
    public void splitMethod(){//切割方法
        String str = "hello|world|us";
        //对字符串以|为根据进行切割遍历
        String[] split = str.split("\\|");
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i]+" ");
        }
    }

}
