package pgtest;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author kinoz
 * @date 2022/4/11 - 19:50
 * @apiNote 学生成绩测试 Vector类使用
 * 体现包装类，有些常用类的形参也要用到包装类
 */
public class ScoreTest {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //创建vector对象,相当数组
        Vector vr = new Vector();

        int maxScore = 0;   //最高分
        for (;;){
            System.out.println("输入学生成绩，输入负数代表结束");
            int score = sc.nextInt();
            if (score < 0){
                break;
            }
            if (score > 100){
                System.out.println("超过限制");
                continue;
            }

            //Integer inScore = score;  //包装类

            vr.addElement(score); //添加元素到vector 自动装箱体现

            //获取学生最高分
            if (maxScore < score){
                maxScore = score;
            }
        }

        char level; //成绩等级
        //遍历vector,获得每个学生成绩,并与最高分比较，得到学生登记
        //vr.size获取存储的元素
        for (int i = 0; i < vr.size(); i++) {
            //获取每一个元素
            Object obj = vr.elementAt(i);

            //1.5以前
            /*Integer it1 = (Integer)obj;
            int iScore = it1.intValue();*/

            //自动拆箱
            int iScore = (int)obj;

            if (maxScore - iScore <= 10){
                level = 'A';
            }else if (maxScore - iScore <= 20){
                level = 'B';
            }else if (maxScore - iScore <= 30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("student-"+ i +"score is:"+iScore+",level is "+level);
        }


    }
}
