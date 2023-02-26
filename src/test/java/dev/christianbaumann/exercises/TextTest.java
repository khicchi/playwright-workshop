package dev.christianbaumann.exercises;

import dev.christianbaumann.Base;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextTest extends Base {

    @Test
    void enterText() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/login");

        page.locator("xpath=//input[@name='username']").type("tomsmith");
        page.locator("xpath=//input[@name='password']").type("SuperSecretPassword!");

        page.locator("button").click();

        Assertions.assertTrue(page.locator("#flash").textContent().contains("You logged into a secure area!"));

        // Enter username & password via label

        // Click the Login-button

        // Verify the successful login

    }
}