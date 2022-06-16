package  Reflects;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;

public class FruitTest {
    Juicer juicer = new Juicer();

    @Test
    public void polymorphismTest(){
        //��̬д����������ָ���������
        juicer.run(new Banana());
        juicer.run(new Apple());
    }
    @Test
    public void reflexTest() throws Exception {
        //����д��
        BufferedReader br = new BufferedReader(new FileReader("config.properties.txt"));

        //BufferedReader�ķ���readLine���Զ�����
        //newInstance�������������ɴ� ������ʾ�������ʵ��
        Class aClass =Class.forName(br.readLine());
        //��������ָ���������,ˮ������ָ��ƻ������
        Fruit fruit = (Fruit) aClass.newInstance();

        Juicer juicer = new Juicer();
        juicer.run(fruit);

    }
}
//��̬�Ѷ��������ȡΪһ���ӿ�
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
