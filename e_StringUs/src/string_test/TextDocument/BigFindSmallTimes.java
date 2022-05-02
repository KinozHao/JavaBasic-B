package string_test.TextDocument;
/*
Question:
在大的字符串中查找小的字符串出现的次数代码实现
*/
public class BigFindSmallTimes {
    public static void main(String[] args) {
        //定义大串
        String max="woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
        //定义小串
        String min="heima";

        //定义计数器变量
        int count=0;
        //定义索引
        int index=0;
        //定义循环,判断小串是否在大串中出现
        while ((index=max.indexOf(min)) !=-1) { //indexOf方法返回指定字符在此字符串中从指定位置后第一次出现处的索引
            count++;                //计数器自增
            max=max.substring(index+min.length());  //substring方法截取字符串
        }
        System.out.println(count);
    }
}
