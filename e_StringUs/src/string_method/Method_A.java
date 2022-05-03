package string_method;

import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/5/2 - 19:52
 * @apiNote һ�ѳ��÷���
 */
public class Method_A {
    @Test
    public void String_Method1(){
        String character = "technology";
        //1.��ȡ����
        System.out.println(character.length());
        //2.��ȡָ���ַ�
        System.out.println(character.charAt(3));


        //3.�жϴ˶����Ƿ�Ϊ��
        System.out.println(character.isEmpty());
        //4.ת����Сд
        System.out.println(character.toUpperCase());
        System.out.println(character.toLowerCase());


        //5.������β�ո�
        String fruit = "  a ppl e  ";
        String afterfruit = fruit.trim();
        System.out.println("-"+afterfruit+"-");
    }

    @Test
    public void String_Method2(){
        //IgnoreCase�������ִ�Сд
        String character1 = "hello";
        String character2 = "HellO";
        //6.�ȽϷ���
        System.out.println(character1.equals(character2));
        System.out.println(character1.equalsIgnoreCase(character2));

        //7.�漰�ַ������򣬲����ǶѺͳ����أ�ֻ�ȽϽ��(���Ϊ0��ʾ��ͬ)
        System.out.println(character1.compareTo(character2));
        System.out.println(character1.compareToIgnoreCase(character2));

        //8.ȡ��ָ�������ַ���������ҿ�
        String character3 = "GermanyScotland";
        System.out.println(character3.substring(7));
        System.out.println(character3.substring(0,6));

        //9.����,�õ���һ����+
        String world = character2.concat("world");
        System.out.println(world);
    }
}
