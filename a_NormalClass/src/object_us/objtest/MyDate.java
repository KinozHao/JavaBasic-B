package object_us.objtest;

/**
 * @author kinoz
 * @date 2022/4/9 - 19:52
 * @apiNote 时间类 equals练习
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMouth() {
        return month;
    }

    public void setMouth(int mouth) {
        this.month = mouth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
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
            return this.day == myDate.day && this.month == myDate.month && this.year == myDate.year;
        }
        return false;
    }

}
