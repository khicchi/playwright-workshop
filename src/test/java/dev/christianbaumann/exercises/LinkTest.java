package dev.christianbaumann.exercises;

import com.microsoft.playwright.Locator;
import dev.christianbaumann.Base;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkTest extends Base {

    @Test
    void clickLink() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/checkboxes");

        Locator checkbox1 = page.locator("input >> nth=0");

        checkbox1.click();

        Assertions.assertTrue(checkbox1.isChecked());

        Locator checkbox2 = page.locator("input >> nth=1");

        checkbox2.click();

        Assertions.assertFalse(checkbox2.isChecked());

        // Click "Checkboxes"

    }
}
