package d_generics.dao_test;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/5/27 - 21:06
 * @apiNote Data Access Object
 * generic�����ݿ���ʶ����е�����
 * ��Ĺ��Բ�����DAO
 */
public class DataAO<T> {
    public void add(T t){

    }
    public boolean remove(int index){
         return false;
    }

    public void update(int index,T t){

    }
    public T getIndex(int index){
        return null;
    }
    public List<T> getForList(int index){
        return null;
    }
    //���ͷ���
    public <E> E getValue(){
        return null;
    }
}
