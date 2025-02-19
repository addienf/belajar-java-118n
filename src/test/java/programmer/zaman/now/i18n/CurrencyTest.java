package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {
    @Test
    void testCurrencyIdn() {
        var idn = new Locale("in", "ID");
        Currency currency = Currency.getInstance(idn);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(idn));
    }

    @Test
    void testCurrencyNumberFormat() {
        var idn = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(idn);

        String format = numberFormat.format(1000000.255);
        System.out.println(format);
    }

    @Test
    void testCurrencyParsing() {
        var idn = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(idn);

        try {
            double value = numberFormat.parse("Rp1.000.000,26").doubleValue();
            System.out.println(value);
        }catch (ParseException e){
            System.out.println("Error Parsing : " + e.getMessage());
        }
    }
}
