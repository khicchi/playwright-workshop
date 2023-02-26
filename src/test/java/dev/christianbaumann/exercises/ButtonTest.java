package dev.christianbaumann.exercises;

import com.microsoft.playwright.Locator;
import dev.christianbaumann.Base;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ButtonTest extends Base {

    @Test
    void clickButton() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/login");

        page.locator("button").click();

        Locator errorMessageElement = page.locator("#flash");

        Assertions.assertTrue(errorMessageElement.isVisible());

        Assertions.assertTrue(errorMessageElement.textContent().contains("Your username is invalid!"));

        // Click the Login-button

        // Verify that the login failed

    }
}