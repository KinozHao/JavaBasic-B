package string_us.StringBuffer.StringBufferMethod;
//注 当缓冲区没有任何索引时候 用任何的方法都会 提示StringIndexOutOfBoundsException
public class AddRemoveAlterMethod {
    public static void main(String[] args) {
        System.out.println("添加-------------");
        add();
        System.out.println("删除-------------");
        remove();
        System.out.println("修改-------------");
        alter();
    }

    private static void alter() {
        StringBuffer sb=new StringBuffer("haoguobin");
        sb.setCharAt(0,'K');    //修改指定位置字符
        sb.setCharAt(1,'I');
        sb.setCharAt(2,'G');
        System.out.println("修改指定位置字符结果"+sb);

        sb.replace(3,5,"kk");   //替换指定位置字符或字符串
        System.out.println("替换指定字符串或者字符结果"+sb);

        System.out.println("字符串反转结果:"+sb.reverse());
    }

    private static void remove() {
        StringBuffer sb=new StringBuffer("china");

        sb.delete(0,1);     //指定范围删除
        System.out.println("删除指定位置结果"+sb);

        sb.deleteCharAt(3); //指定位置删除
        System.out.println("删除指定位置结果"+sb);

        sb.delete(0,sb.length());   //清空缓冲区
        System.out.println("清空缓存区的结果:"+sb);
    }

    private static void add() {
        StringBuffer sb=new StringBuffer(); //定义一个字符串缓冲区
        sb.append("abcdefj");       //在末尾添加字符串
        System.out.println("append的添加结果为"+sb);

        sb.insert(2,"124"); //在指定位置插入字符串
        System.out.println("insert的添加结果为"+sb);
    }
}
