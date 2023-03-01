package jdk8_newfeature.stream.sangeng.stream;

import jdk8_newfeature.stream.sangeng.pojo.Author;
import java.util.List;


/**
 * @author kinoz
 * @Date 2023/3/1 16:26
 * @apiNote
 */
public class StreamFirst {
    public static void main(String[] args) {
        //获取pojo中创建的数据
        List<Author> data = Author.getAuthorsAndBook();

        //1.获取所有年龄小于18的人的姓名
        data.stream()   //集合转换到流
            .distinct() //去重
            .filter(author -> author.getAge()<18)   //年龄小于18的
            .forEach(author -> System.out.println(author.getName()));   //遍历年龄小于18的人的姓名
    }
}
