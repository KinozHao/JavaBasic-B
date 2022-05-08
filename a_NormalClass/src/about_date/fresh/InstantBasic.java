package about_date.fresh;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * @author kinoz
 * @Date 2022/5/8 - 21:25
 * @apiNote Ë²Ê±µãÀà like Date Plus version.
 */
public class InstantBasic {
    @Test
    public void test1() throws ParseException {
        Instant times = Instant.now();
        //default TimeZone UTC
        System.out.println(times);

        //+8 hour is CN time (Offset)
        OffsetDateTime localTime = times.atOffset(ZoneOffset.ofHours(8));
        System.out.println(localTime);

        //from 1970-1-1-00:00:00 ---> now millisecond
        long i = times.toEpochMilli();
        System.out.println("millisecond:"+i);
        //used ofEpochMilli parse to normal format
        System.out.println(Instant.ofEpochMilli(i));

    }
}
