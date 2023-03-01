package jdk8_newfeature.pojo;

import lombok.*;

/**
 * @author kinoz
 * @Date 2022/11/14 10:31
 * @apiNote
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    public int id;
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String s) {
    }

    //This is about the editor's info
    public void info() throws ClassCastException{
        System.out.println("This is a code editTools");
    }

    //This is about you want secret info
    private String secretInfo(String str) throws RuntimeException{
        System.out.println(str);
        return null;
    }
    private static void anotherMethod(){
        System.out.println("just a static method my answer");
    }

}
