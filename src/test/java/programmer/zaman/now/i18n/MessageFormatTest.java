package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {
    @Test
    void testMeassageFormat() {

        String pattern = "Hi {0}, Anda bisa mencari data Anda dengan mengetik `{0}` di pencarian. ";
        MessageFormat messageFormat = new MessageFormat(pattern);

        String format = messageFormat.format(new Object[]{"Addien"});
        System.out.println(format);
    }

    @Test
    void testMessageFormat2() {
        var resourceBundle = ResourceBundle.getBundle("message");

        var idn = new Locale("in", "ID");
        var resourceBundleIdn = ResourceBundle.getBundle("message", idn);

        String pattern = resourceBundleIdn.getString("welcome.message");
        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{
           "Addien", "Programmer Zaman Now"
        });

        System.out.println(format);
    }
}
