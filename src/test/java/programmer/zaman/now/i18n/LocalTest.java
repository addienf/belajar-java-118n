package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocalTest {

    @Test
    void testNewLocal() {
        var language = "id";
        var country = "ID";

        var locale1 = new Locale(language, country);

        System.out.println(locale1.getLanguage());
        System.out.println(locale1.getCountry());

        System.out.println(locale1.getDisplayLanguage());
        System.out.println(locale1.getDisplayCountry());
    }

    @Test
    void testNewLocalUS() {
        var language = "en";
        var country = "US";

        var locale1 = new Locale(language, country);

        System.out.println(locale1.getLanguage());
        System.out.println(locale1.getCountry());

        System.out.println(locale1.getDisplayLanguage());
        System.out.println(locale1.getDisplayCountry());
    }
}
