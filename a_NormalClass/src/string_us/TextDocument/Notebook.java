package string_us.TextDocument;


public class Notebook {
    public static void main(String[] args) {

        appendMethod();


    }

    private static void appendMethod() {
        StringBuffer sb=new StringBuffer();
        sb.append("abcdefj");
        System.out.println("sb添加之后的结果"+sb);
    }
}
