package jdk8_newfeature.stream.sangeng.stream;

import jdk8_newfeature.stream.sangeng.pojo.Author;
import jdk8_newfeature.stream.sangeng.pojo.Book;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author kinoz
 * @Date 2023/3/3 18:45
 * @apiNote stream流中终结操作的使用
 */
public class TerminalOption {
    List<Author> data = Author.getAuthorsAndBook();

    @Test
    public void CountTest(){
        //获取作家中所有的数据总数 并且去重
        long count = data.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .count();
        System.out.println(count);
    }

    @Test
    public void MaxAndMinTest(){
        //所有作家的书籍的最高分和最低分打印
        //最高分
        Optional<Integer> max = data.stream()
                .flatMap(author -> author.getBooks().stream().map(book -> book.getScore()))
                .max((o1, o2) -> o1 - o2);
        System.out.println(max.get());
        //最低分
        Optional<Integer> min = data.stream()
                .flatMap(author -> author.getBooks().stream().map(book -> book.getScore()))
                .min((o1, o2) -> o1 - o2);

    }

    @Test        //把获取到的数据转换为一个集合
    public void CollectTest(){
        //List集合
        //获取所有作家的名字存放在一个集合中
        List<String> author_Name = data.stream()
                .map(author -> author.getName())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(author_Name+"\n");

        //Set集合
        //获取所有书名的set集合
        Set<String> allBookName = data.stream()
                .flatMap(author -> author.getBooks().stream().map(book -> book.getName()))
                .collect(Collectors.toSet());
        System.out.println(allBookName+"\n");

        //Map集合
        //获取一个Map集合，map的key为作者名，value为List<Book>
        Map<String, List<Book>> authorAndListBook = data.stream()
                .distinct()
                .collect(Collectors.toMap(author -> author.getName(), author -> author.getBooks()));
        System.out.println(authorAndListBook);
    }
}
