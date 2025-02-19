package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    @Test
    void testNumberFormat() {
        var idn = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getInstance(idn);

        String format = numberFormat.format(100000000.255);

        System.out.println(format);
    }

    @Test
    void testNumberFormatParse() {
        var idn = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getInstance(idn);

        try {
            double number = numberFormat.parse("10.000.000,255").doubleValue();
            System.out.println(number);
        }catch (ParseException e){
            System.out.println("Error Parsing : " + e.getMessage());
        }
    }
}
