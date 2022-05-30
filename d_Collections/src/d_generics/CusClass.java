package d_generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/5/27 - 14:48
 * @apiNote �Զ��巺�����ʹ��
 * �ɲο�JDK�м��ϵķ���д��
 * @see java.util.Collection
 * @see List
 */
public class CusClass {
    @Test
    public void ccTest(){
        //ָ����������ΪString
        ccData<String> cc = new ccData<>();
        cc.setParamE("Hello world");
        System.out.println(cc);

        //��������ʵ��
        ccSon<Integer> ccs = new ccSon<>();
        ccs.sonE = 500;
        System.out.println(ccs);

        //���ͷ�������
        Double[] db = {23.2,32.4,53.2,52.2};
        //�µ����ݽ���db������(���ͷ������ڵ���ʱ��ָ�����Ͳ��������͵�)
        List<Double> DBList = cc.copyList(db);
        System.out.println(DBList);
    }
}
//������
class ccData<E>{
    private int num;
    private String describe;
    //��������
    private E ParamE;
    //���ͷ���(�뷺�ͽӿںͷ������޹�)
    //����Զ����������鵽ArrayList������
    public <W> List<W> copyList(W[] arr){
        ArrayList<W> param = new ArrayList<>();
        for (W w : arr) {
            param.add(w);
        }
        return param;
    }

    public ccData(){

    }

    public ccData(int num, String describe, E getE) {//�����β�
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
//����͸���ͬʱ�߱�������
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