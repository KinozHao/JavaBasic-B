package jdk8_newfeature.lambda;

import org.junit.Test;

import java.util.function.IntConsumer;

/**
 * @author kinoz
 * @Date 2023/3/1 15:32
 * @apiNote
 */
public class LambdaThree {

    @Test
    public void InstanceA(){
        //匿名内部类
        foreachArr(new IntConsumer() {
            @Override
            public void accept(int value) {
                //System.out.println(value);
            }
        });

        //λ
        foreachArr((int value) -> {
            System.out.println(value);
        });
    }
    public static void foreachArr(IntConsumer consumer){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            consumer.accept(i);
        }
    }
}

