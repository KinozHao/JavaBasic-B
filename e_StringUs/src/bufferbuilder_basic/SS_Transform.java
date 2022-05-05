package bufferbuilder_basic;
/*
* String与StringBuffer之间的转换
* */
public class SS_Transform {
    public static void main(String[] args) {
        System.out.println("这里是String转换到StringBuffer");
        StringToStringBuffer();
        System.out.println("**************************");


        System.out.println("StringBuffer转换到String");
        StringBufferToString();
    }

    private static void StringBufferToString() {
        StringBuffer s1=new StringBuffer("jifeng");
        //String的构造方法
        String s2=new String(s1);
        System.out.println("String的构造方法实现"+s1);
        //ToString方法
        String s3=s1.toString();
        System.out.println("通过toString方法实现"+s3);
        //substring方法
        String s4=s1.substring(0,s1.length());
        System.out.println("通过截取方法substring实现"+s4);
    }

    private static void StringToStringBuffer() {
        //构造方法
        StringBuffer s = new StringBuffer("Heima");
        System.out.println("StringBuffer的构造方法实现"+s);

        //append方法
        StringBuffer s2=new StringBuffer();
        s2.append("heima");
        System.out.println("StringBuffer的append方法实现"+s2);
    }
}
