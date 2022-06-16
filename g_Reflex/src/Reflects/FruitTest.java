package  Reflects;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;

public class FruitTest {
    Juicer juicer = new Juicer();

    @Test
    public void polymorphismTest(){
        //多态写法父类引用指向子类对象
        juicer.run(new Banana());
        juicer.run(new Apple());
    }
    @Test
    public void reflexTest() throws Exception {
        //反射写法
        BufferedReader br = new BufferedReader(new FileReader("config.properties.txt"));

        //BufferedReader的方法readLine可以读整行
        //newInstance方法概述创建由此 类对象表示的类的新实例
        Class aClass =Class.forName(br.readLine());
        //父类引用指向子类对象,水果引用指向苹果对象
        Fruit fruit = (Fruit) aClass.newInstance();

        Juicer juicer = new Juicer();
        juicer.run(fruit);

    }
}
//多态把多个方法抽取为一个接口
interface Fruit {
    public void squeeze();
}

class Apple implements Fruit{
    public void squeeze(){
        System.out.println("Apple juicer");
    }
}

class Banana implements Fruit{
    public void squeeze(){
        System.out.println("Banana juicer");
    }
}

class Juicer {
    public void run(Fruit fruit){
        fruit.squeeze();
    }

}
