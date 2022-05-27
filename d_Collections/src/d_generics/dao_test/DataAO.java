package d_generics.dao_test;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/5/27 - 21:06
 * @apiNote Data Access Object
 * generic在数据库访问对象中的体现
 * 表的共性操作的DAO
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
    //泛型方法
    public <E> E getValue(){
        return null;
    }
}
