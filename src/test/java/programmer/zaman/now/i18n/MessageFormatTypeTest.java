package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {

    @Test
    void testMessageFormatType() {
        var resourceBundle = ResourceBundle.getBundle("message");
        var idn = new Locale("id", "ID");
        var resourceBundleIdn = ResourceBundle.getBundle("message", idn);

        String pattern = resourceBundleIdn.getString("status");
        MessageFormat messageFormat = new MessageFormat(pattern, idn);
        String format = messageFormat.format(new Object[]{
                "Addien", new Date(), 1000000
        });

        System.out.println(format);
    }
}
