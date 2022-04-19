package Test;

import java.util.Random;

public class RandomName {
    public static void main(String[] args) {
        String name =getRandomName();
        System.out.println(name);
    }

    private static String getRandomName() {
        String[] name ={"刘岩","卢旺","陈子🐏","成周周"};
        Random r = new Random();
        int r1 =r.nextInt(name.length);

        return name[r1];
    }
}