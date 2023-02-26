package dev.christianbaumann.exercises;

import com.microsoft.playwright.Locator;
import dev.christianbaumann.Base;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DragAndDropTest extends Base {

    @Test
    void dragAndDrop() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/drag_and_drop");

        Locator aElement = page.locator("#column-a");

        Locator bElement = page.locator("#column-b");

        aElement.dragTo(bElement);

        Locator columnsDiv = page.locator("#columns");

        Locator firstDivContent = columnsDiv.locator("header >> nth=0");

        //Locator firstDivContent = page.locator("div header >> nth=0");

        Assertions.assertEquals(firstDivContent.textContent(), "B", "first div content was not matched");

        // Drag A onto B

        //Verify

    }
}