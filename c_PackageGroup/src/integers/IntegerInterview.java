package integers;
/*
* -128到127是byte的取值范围,如果在这个取值范围内,自动装箱就不会创建新对象,而是从常量池中获取
* 如果超过了byte取值范围就会再新创建对象
* */
public class IntegerInterview {
    public static void main(String[] args) {
        Integer i1 = new Integer(97);
        Integer i2 = new Integer(97);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println("-----------------");

        Integer i3=97;
        Integer i4=97;
        System.out.println(i3==i4);
        System.out.println(i3.equals(i4));
        System.out.println("------------------");

        Integer i5=197;
        Integer i6=197;
        System.out.println(i5==i6);
        System.out.println(i5.equals(i6));
        System.out.println("-----------------");
    }
}
