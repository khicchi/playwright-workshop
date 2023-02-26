package dev.christianbaumann.exercises;

import com.microsoft.playwright.Locator;
import dev.christianbaumann.Base;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DropdownTest extends Base {

    @Test
    void selectFromDropdown() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/dropdown");

        Locator dropDownElement = page.locator("#dropdown");

        String optionToSelect = "Option 1";

        dropDownElement.selectOption("1");


        Assertions.assertEquals(page.locator("option[selected='selected']").textContent(), optionToSelect);

        // Select a value from the dropdown

        // Verify the value selection

    }
}