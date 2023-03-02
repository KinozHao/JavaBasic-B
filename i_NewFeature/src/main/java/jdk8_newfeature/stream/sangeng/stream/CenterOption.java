package jdk8_newfeature.stream.sangeng.stream;

import jdk8_newfeature.stream.sangeng.pojo.Author;
import jdk8_newfeature.stream.sangeng.pojo.Book;
import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;


/**
 * @author kinoz
 * @Date 2023/3/1 16:26
 * @apiNote this code is about the stream center option use
 */
public class CenterOption {
    //获取pojo中创建的数据
    List<Author> data = Author.getAuthorsAndBook();

    @Test
    public void basicTest() {
        //1.获取所有年龄小于18的人的姓名
        data.stream()   //集合转换到流
            .distinct() //去重
            .filter(author -> author.getAge()<18)   //年龄小于18的
            .forEach(author -> System.out.println(author.getName()));   //遍历年龄小于18的人的姓名
    }

    @Test
    public void FilterTest(){
        //获取作家名称长度大于3的作家名称
        data.stream()
            .distinct()
            .filter(author -> author.getName().length()>2)
            .forEach(author -> System.out.println(author.getName()));
    }

    @Test
    public void MapTest(){
        //类型转换:使用map打印所有作家姓名,把原本的作家类型转换为了String类型
        data.stream()
            .map(author -> author.getName())
            .forEach(author -> System.out.println(author));

        //进行数据计算 让每个作家的年龄加10
        data.stream()
                .map(author -> author.getAge())
                .map(age -> age+10)
                .forEach(age -> System.out.println(age));
    }

    @Test
    public void SortedTest(){
        //按照年龄降序排序所有作家的年龄
        //sorted里面是一个Comparator接口,可参考SE部分的笔记
        //若使用的是空参的sorted,需要流的元素实现了Comparable接口
        data.stream()
                .distinct()
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .forEach(author -> System.out.println(author.getAge()));
    }

    @Test
    public void LimitTest(){
        //按照年龄降序排序,去重,只要年纪最大的两个人
        data.stream()
                .distinct()
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .limit(2)
                .forEach(author -> System.out.println(author.getAge()));

    }
    @Test
    public void SkipTest(){
        //打印除了年龄最大的作家外的其他作家，要求不能有重复元素，并且按照年龄降序排序。
        data.stream()
                .distinct()
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .skip(1)    //排序过后第一个就是年龄最大的 使用skip跳过
                .forEach(author -> System.out.println(author.getName()));
    }

    @Test
    public void flatMapTest(){
        //1:打印所有书籍的名字。要求对重复的元素进行去重

        //若使用map需要二次对book数据进行遍历
        /*data.stream()
                .map(author -> author.getBooks())
                .forEach(new Consumer<List<Book>>() {
                    @Override
                    public void accept(List<Book> books) {
                        books.forEach(book -> System.out.println(book));
                    }
                });*/

        //使用flatMap
        // flatMap里面接口内置方法的返回值为一个流的类型
        // 我们把获取得到的book集合作为流进行返回即可
        data.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .forEach(book -> System.out.println(book));

        System.out.println("\n");
        //2:打印现有数据的所有分类。要求对分类进行去重。不能出现这种格式：哲学,爱情
        //使用匿名内部类方便理解
        data.stream()
                .flatMap(data -> data.getBooks().stream())
                .distinct()
                .flatMap(new Function<Book, Stream<?>>() {
                    @Override
                    public Stream<?> apply(Book book) {
                        return Arrays.stream(book.getCategory().split((",")));
                    }
                })
                .distinct()
                .forEach(new Consumer<Object>() {
                    @Override
                    public void accept(Object category) {
                        System.out.println(category);
                    }
                });
        //使用λ 进行了两次去重 第一次书籍去重 第二次分类标识去重
        data.stream().flatMap(data -> data.getBooks().stream())
                .distinct()
                .flatMap(book -> Arrays.stream(book.getCategory().split(",")))
                .distinct()
                .forEach(category -> System.out.println(category));
    }
}
