package annotation_us;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author kinoz
 * @Date 2022/5/13 - 19:07
 * @apiNote 注解(Annotation)的理解与使用
 */

public class ZJBasic implements Message{
    public static void main(String[] args) {
        int a = 19;
    }
    //@MyAnnotation("a") 注解中Target表明了不能用于修饰METHOD
    //表示单元测试
    @Test
    public void method(){
    }
    @Override
    public void OldMes() {

        @SuppressWarnings("unused")
        int num = 10;
        //表示此变量没有使用
        @SuppressWarnings({"unused","rawtypes"})
        ArrayList alt = new ArrayList();
    }
}

interface Message{
    //表示方法过时
    @Deprecated
    void OldMes();
}
