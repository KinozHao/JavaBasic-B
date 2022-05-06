package string_test.algorithm;

import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/5/6 - 19:59
 * @apiNote 写一个方法 提取出字符一包含字符二的相同字符
 * For instance StrA:"dalfjaAOD",StrB:"AOB"
 * print result: AOB
 */
public class FindSameCharacterF {
    @Test
    public void SameTest(){
        System.out.println(getMaxSameString("abcdesdfafdoc","doc"));
    }
    public String getMaxSameString(String mainStr,String subStr){
        //输入不能为空
        if (mainStr != null && subStr != null) {
            synchronized (this) {
                //取出mainStr或subStr其中一个的长度
                String maxStr = mainStr.length() >= subStr.length() ? mainStr : subStr;
                String minStr = mainStr.length() < subStr.length() ? mainStr : subStr;

                int length = minStr.length();
                //外层要比较多少大轮
                for (int i = 0; i < length; i++) {
                    for (int x = 0, y = length - i; y <= length; x++, y++) {

                        //minStr具体的字符
                        String returnStr = minStr.substring(x, y);

                        //第一大轮只用判断minStr 后面的就需要用新的变量returnStr来判断
                        if (maxStr.contains(returnStr)) {
                            return returnStr;
                        }
                    }
                }
            }
        }
        return null;
    }
}
