package bufferbuilder_basic;
/*
* String��StringBuffer֮���ת��
* */
public class SS_Transform {
    public static void main(String[] args) {
        System.out.println("������Stringת����StringBuffer");
        StringToStringBuffer();
        System.out.println("**************************");


        System.out.println("StringBufferת����String");
        StringBufferToString();
    }

    private static void StringBufferToString() {
        StringBuffer s1=new StringBuffer("jifeng");
        //String�Ĺ��췽��
        String s2=new String(s1);
        System.out.println("String�Ĺ��췽��ʵ��"+s1);
        //ToString����
        String s3=s1.toString();
        System.out.println("ͨ��toString����ʵ��"+s3);
        //substring����
        String s4=s1.substring(0,s1.length());
        System.out.println("ͨ����ȡ����substringʵ��"+s4);
    }

    private static void StringToStringBuffer() {
        //���췽��
        StringBuffer s = new StringBuffer("Heima");
        System.out.println("StringBuffer�Ĺ��췽��ʵ��"+s);

        //append����
        StringBuffer s2=new StringBuffer();
        s2.append("heima");
        System.out.println("StringBuffer��append����ʵ��"+s2);
    }
}
