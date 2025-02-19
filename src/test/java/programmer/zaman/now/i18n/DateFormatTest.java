package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    void testDateFormat() {
        var pattern = "EEEE dd MMMM yyyy";

        var dateFormat = new SimpleDateFormat(pattern);

        var format = dateFormat.format(new Date());

        System.out.println(format);

    }

    @Test
    void testDateFormatID() {
        var pattern = "EEEE dd MMMM yyyy";
        var idn = new Locale("in", "ID");

        var dateFormat = new SimpleDateFormat(pattern, idn);

        var format = dateFormat.format(new Date());

        System.out.println(format);

    }

    @Test
    void testDateFormatTryCach() {
        var pattern = "EEEE dd MMMM yyyy";
        var idn = new Locale("in", "ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, idn);

        try {
            Date date = dateFormat.parse("Minggu 28 Februari 2021");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Error Parsing : " +e.getMessage());
        }

    }
}
