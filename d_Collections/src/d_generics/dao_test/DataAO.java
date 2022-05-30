package d_generics.dao_test;

import java.util.*;

/**
 * @author kinoz
 * @Date 2022/5/27 - 21:06
 * @apiNote Data Access Object
 * generic在数据库访问对象中的体现
 * 表的共性操作的DAO
 */
public class DataAO<T> {

    private Map<String,T> map = new HashMap<>();
    //添加元素
    public void add(String id,T entity){
        map.put(id,entity);
    }
    //获取指定id元素
    public T get(String id){
         return map.get(id);
    }
    //替换key值 原有的id改为entity
    public void update(String id,T entity){
        if (map.containsKey(id)){
            map.put(id,entity);
        }
    }
    //返回map中存放的所有T对象
    public List<T> list(){
        ArrayList<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t:values){
            list.add(t);
        }
        return list;
    }
    //删除指定id的对象
    public void reomve(String id){
        map.remove(id);
    }
    //泛型方法
    public <E> E getValue(){
        return null;
    }
}
