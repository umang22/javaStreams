import javax.xml.bind.DatatypeConverter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DateSample {
    public static void main(String[] args) {
        String startDate = "2020-05-10T09:12:00.000Z";
        String endDate = "2020-05-12T05:00:00.000Z";
        String startTime = "2020-05-10T12:04:42.551Z";
        String endTime = "2020-05-10T13:57:43.154Z";

        Calendar currentDate = Calendar.getInstance();
        Calendar sd = DatatypeConverter.parseDate(startDate);
        Calendar se = DatatypeConverter.parseDate(endDate);
        Calendar st = DatatypeConverter.parseDate(startTime);
        Calendar et = DatatypeConverter.parseDate(endTime);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        TimeZone gmt = TimeZone.getTimeZone("GMT");
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        df.setTimeZone(TimeZone.getDefault());
        //Here you say to java the initial timezone. This is the secret
        //Will print in UTC
//        System.out.println(df.format(et.getTime()));
        //Here you set to your timezone
        //Will print on your default Timezone
        String format = df.format(et.getTime());
        System.out.println("format --> " + format);
//        System.out.println(df.format(sd.getTime()));
        System.out.println(sd.get(Calendar.HOUR));
        System.out.println(sd.get(Calendar.MINUTE));


        System.out.println("Current");
        System.out.println("=================================");
        /*System.out.println("yy" + currentDate.get(Calendar.YEAR));
        System.out.println("mm" + currentDate.get(Calendar.MONTH));
        System.out.println("dd" + currentDate.get(Calendar.DATE));
        */
        System.out.println("--> " + currentDate.getTime());
        System.out.print("HH" + currentDate.get(Calendar.HOUR));
        System.out.print("   MM" + currentDate.get(Calendar.MINUTE));
        System.out.print("   SS" + currentDate.get(Calendar.SECOND));
        System.out.println();
        System.out.println("Start  time");
        System.out.print("hh" + st.get(Calendar.HOUR));
        System.out.print("   mm" + st.get(Calendar.MINUTE));
        System.out.print("   ss" + st.get(Calendar.SECOND));
        System.out.println();

        /*System.out.println("HH" + df.format(st.get(Calendar.HOUR)));
        System.out.println("MM" + df.format(st.get(Calendar.MINUTE)));
        System.out.println("SS" + df.format(st.get(Calendar.SECOND)));
*/
        /*System.out.println("=================================");
        System.out.println("yy" + sd.get(Calendar.YEAR));
        System.out.println("mm" + sd.get(Calendar.MONTH));
        System.out.println("dd" + sd.get(Calendar.DATE));*/
        if (
                ((currentDate.get(Calendar.YEAR) == sd.get(Calendar.YEAR)) &&
                        (currentDate.get(Calendar.MONTH) >= sd.get(Calendar.MONTH)) &&
                        (currentDate.get(Calendar.DATE) >= sd.get(Calendar.DATE)))
                        &&
                        ((currentDate.get(Calendar.YEAR) == se.get(Calendar.YEAR)) &&
                                (currentDate.get(Calendar.MONTH) <= se.get(Calendar.MONTH)) &&
                                (currentDate.get(Calendar.DATE) <= se.get(Calendar.DATE)))


        ) {
            System.out.println("true");
        } else
            System.out.println("false");

        System.out.println("===========================================================");
        System.out.println("Check time for Maintenance Window");
        if (
                ((currentDate.get(Calendar.HOUR) == st.get(Calendar.HOUR)) &&
                        (currentDate.get(Calendar.MINUTE) >= st.get(Calendar.MINUTE))
                        && (currentDate.get(Calendar.SECOND) >= st.get(Calendar.SECOND))
                )
                        &&
                        ((currentDate.get(Calendar.HOUR) == et.get(Calendar.HOUR)) &&
                                (currentDate.get(Calendar.MINUTE) <= et.get(Calendar.MINUTE))
                                && (currentDate.get(Calendar.SECOND) <= et.get(Calendar.SECOND))
                        )


        ) {
            System.out.println("true");
        } else
            System.out.println("false");
    }

}
