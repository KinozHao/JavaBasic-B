package d_generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/5/27 - 14:48
 * @apiNote 自定义泛型类的使用
 * 可参考JDK中集合的泛型写法
 * @see java.util.Collection
 * @see List
 */
public class CusClass {
    @Test
    public void ccTest(){
        //指定泛型类型为String
        ccData<String> cc = new ccData<>();
        cc.setParamE("Hello world");
        System.out.println(cc);

        //泛型子类实例
        ccSon<Integer> ccs = new ccSon<>();
        ccs.sonE = 500;
        System.out.println(ccs);

        //泛型方法体现
        Double[] db = {23.2,32.4,53.2,52.2};
        //新的数据接收db的数据(泛型方法是在调用时，指定泛型参数的类型的)
        List<Double> DBList = cc.copyList(db);
        System.out.println(DBList);
    }
}
//泛型类
class ccData<E>{
    private int num;
    private String describe;
    //泛型属性
    private E ParamE;
    //泛型方法(与泛型接口和泛型类无关)
    //存放自定义类型数组到ArrayList集合中
    public <W> List<W> copyList(W[] arr){
        ArrayList<W> param = new ArrayList<>();
        for (W w : arr) {
            param.add(w);
        }
        return param;
    }

    public ccData(){

    }

    public ccData(int num, String describe, E getE) {//泛型形参
        this.num = num;
        this.describe = describe;
        this.ParamE = getE;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
    public E getParamE() {
        return ParamE;
    }

    public void setParamE(E paramE) {
        this.ParamE = paramE;
    }

    @Override
    public String toString() {
        return "ccData{" +
                "num=" + num +
                ", describe='" + describe + '\'' +
                ", ParamE=" + ParamE +
                '}';
    }
}
//子类和父类同时具备泛型类
class ccSon<E> extends ccData<E>{
    E sonE;
    public ccSon(){

    }
    public ccSon(int num, String describe, E getE,E sonE) {
        super(num, describe, getE);
        this.sonE = sonE;
    }

    @Override
    public String toString() {
        return "ccSon{" +
                "sonE=" + sonE +
                '}';
    }
}