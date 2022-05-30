package d_generics.dao_test;

import java.util.*;

/**
 * @author kinoz
 * @Date 2022/5/27 - 21:06
 * @apiNote Data Access Object
 * generic�����ݿ���ʶ����е�����
 * ��Ĺ��Բ�����DAO
 */
public class DataAO<T> {

    private Map<String,T> map = new HashMap<>();
    //���Ԫ��
    public void add(String id,T entity){
        map.put(id,entity);
    }
    //��ȡָ��idԪ��
    public T get(String id){
         return map.get(id);
    }
    //�滻keyֵ ԭ�е�id��Ϊentity
    public void update(String id,T entity){
        if (map.containsKey(id)){
            map.put(id,entity);
        }
    }
    //����map�д�ŵ�����T����
    public List<T> list(){
        ArrayList<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t:values){
            list.add(t);
        }
        return list;
    }
    //ɾ��ָ��id�Ķ���
    public void reomve(String id){
        map.remove(id);
    }
    //���ͷ���
    public <E> E getValue(){
        return null;
    }
}
