package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class ChoiseFormatTest {

    @Test
    void testFormatChoice() {
        String pattern = "-1#negatif | 0#kosong | 1#satu | 1<banyak";
        ChoiceFormat choiceFormat = new ChoiceFormat(pattern);
        String format = choiceFormat.format(2);
        System.out.println(format);
    }

    @Test
    void testFormatChoice2() {
        var idn = new Locale("id", "ID");
        var resourceBundleIdn = ResourceBundle.getBundle("message", idn);
        String pattern = resourceBundleIdn.getString("balance");
        MessageFormat messageFormat = new MessageFormat(pattern, idn);
        String format = messageFormat.format(new Object[]{
                1
        });

        System.out.println(format);
    }
}
