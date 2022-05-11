package string_test.algorithm;

//在大的字符串中查找小的字符串出现的次数代码实现

import org.junit.Test;

public class BigFindSmallTimes {
    @Test
    public void AllTest(){
        System.out.println(countMethod("abababab","a"));

    }

    public synchronized static int countMethod(String mainStr,String subStr){
        //mainStr长度一定要大于subStr长度
        int mainLength = mainStr.length();
        int subLength  = subStr.length();
        if (mainLength > subLength) {
            //1.用于返回出现的次数
            int count = 0;
            //2.定义索引
            int index = 0;
            //3.判断index是不是-1
            /*while ((index = mainStr.indexOf(subStr)) != -1) {
                //每得到一次索引count自增
                count++;
                //4.每次对现有的字符串进行修改
                mainStr = mainStr.substring(index + subStr.length());
            }*/

            while ((index = mainStr.indexOf(subStr,index)) != -1) {
                //每得到一次索引count自增
                count++;
                //4.每次通过新的字符串索引往后找
                index += subLength;
            }

            return count;
        }
        return 0;
    }
}
