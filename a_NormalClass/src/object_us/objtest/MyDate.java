package object_us.objtest;

/**
 * @author kinoz
 * @date 2022/4/9 - 19:52
 * @apiNote 时间类 equals练习
 */
public class MyDate {
    private int day;
    private int mouth;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int a, int b, int c) {
        this.day = a;
        this.mouth = b;
        this.year = c;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day &&
                mouth == myDate.mouth &&
                year == myDate.year;
    }*/

    //手写equals的重写
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj instanceof MyDate){
            MyDate myDate = (MyDate)obj;
            return this.day == myDate.day && this.mouth == myDate.mouth && this.year == myDate.year;
        }
        return false;
    }

}
