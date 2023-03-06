package jdk8_newfeature.stream.sangeng.stream;

import jdk8_newfeature.stream.sangeng.pojo.Author;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * @author kinoz
 * @Date 2023/3/3 19:24
 * @apiNote 查找与匹配
 */
public class FindMatchOption {
    List<Author> data = Author.getAuthorsAndBook();

    @Test
    public void anyMatchTest(){
        //判断是否有存在年龄大于20岁的作家
        boolean var = data.stream().anyMatch(author -> author.getAge() > 20);
        System.out.println(var);
    }
    @Test
    public void allMatchTest(){
        //判断所有作家是不是都是成年人
        System.out.println(data.stream().allMatch(author -> author.getAge() >= 18));
    }
    @Test
    public void noneMatchTest(){
        //判断所有作家是不是都不到100岁以上
        System.out.println(data.stream().noneMatch(author -> author.getAge() >= 100));

    }
    @Test
    public void findAnyTest() {
        //获取任意一个年龄大于18岁的作家,存在的话就输出他的名字
        Optional<Author> authors = data.stream()
                .filter(author -> author.getAge()>18)
                .findAny();

        //若有名字的话就会输出，没有的话也不会报空指针异常,这就是optional的好处
        authors.ifPresent(author -> System.out.println(author.getName()));
    }
    @Test
    public void findFirst() {
        //获取一个年龄最小的作家,并输出他的名字
        Optional<Author> firstAuthor = data.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).findFirst();

        firstAuthor.ifPresent(author -> System.out.println(author.getName()));

    }

}
