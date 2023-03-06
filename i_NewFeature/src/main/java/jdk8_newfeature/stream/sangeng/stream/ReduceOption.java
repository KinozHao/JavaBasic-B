package jdk8_newfeature.stream.sangeng.stream;

import jdk8_newfeature.stream.sangeng.pojo.Author;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

/**
 * @author kinoz
 * @Date 2023/3/6 18:45
 * @apiNote
 */
public class ReduceOption {
    List<Author> data = Author.getAuthorsAndBook();

    // reduce两个参数的形式
    @Test
    public void reduceTestA(){
        //归并操作
        //求所有作者年龄的和 去重
        Optional<Integer> reduce = data.stream()
                .distinct()
                .map(author -> author.getAge())
                .reduce((result, element) -> result + element);
        reduce.ifPresent(sum -> System.out.println(sum));
    }
    @Test
    public void reduceTestB(){
        //求年龄最大的作者,并输出他的年龄
        Integer BigAge = data.stream()
                .map(author -> author.getAge())
                .reduce(Integer.MIN_VALUE, (result, element) -> result < element ? element : result);
        System.out.println(BigAge);
    }

    @Test
    public void reduceTestC(){
        //求年龄最小的作者,并输出他的年龄
        Integer LittleAge = data.stream()
                .map(author -> author.getAge())
                .reduce(Integer.MAX_VALUE, (result, element) -> result > element ? element : result);
        System.out.println(LittleAge);
    }
    // reduce一个参数的形式
    @Test
    public void reduceOneTest(){
        //求所有作者年龄最小那个并打印
        Optional<Integer> little = data.stream()
                .map(author -> author.getAge())
                .reduce((result, element) -> result > element ? element : result);
        little.ifPresent(o -> System.out.println(o));
    }
}
