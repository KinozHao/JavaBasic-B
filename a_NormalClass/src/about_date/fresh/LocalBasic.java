package about_date.fresh;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author kinoz
 * @Date 2022/5/8 - 20:53
 * @apiNote 与local相关的类
 * it like's Calender Plus Version
 * we normal used LocalDateTime more!
 * the other two method just understand it,is ok.
 */
public class LocalBasic {
    @Test
    public void classInstance(){
        //Mode 1 defaultTime
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println("---------");

        //Mode 2 assignTime (noOffset)
        System.out.println(LocalDateTime.of(1235,4,6,5,29));
    }

    @Test
    public void normalMethod(){
        //get()
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.getDayOfYear());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getMonthValue());

        //the quality can't change
        //withXxx() : setting
        LocalDateTime changeyear = ldt.withDayOfYear(1);
        LocalDateTime changemonth = ldt.withDayOfMonth(1);
        System.out.println("init value:"+ldt);
        System.out.println("change year:"+changeyear);
        System.out.println("change month:"+changemonth);

        //plusXxx : +
        LocalDateTime plusyear = ldt.plusYears(1);
        System.out.println("plus year:"+plusyear);

        //minusXxx : -
        LocalDateTime minusyear = ldt.minusYears(1);
        System.out.println("minus year:"+minusyear);
    }
}
