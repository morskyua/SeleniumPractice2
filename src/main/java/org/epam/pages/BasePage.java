package org.epam.pages;

import org.epam.util.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected final WebDriver driver = WebDriverSingleton.getDriver();
}
