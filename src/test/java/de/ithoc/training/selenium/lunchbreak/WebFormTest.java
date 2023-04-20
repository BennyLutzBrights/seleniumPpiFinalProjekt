package de.ithoc.training.selenium.lunchbreak;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;



public class WebFormTest {

    private WebDriver chromeDriver;

    @BeforeEach
    public void setUp() {
        // Create driver with the option to allow remote origins.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        chromeDriver = new ChromeDriver(options);

        // Wait a little to ensure website has been loaded.
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    }

    @AfterEach
    public void tearDown() {
        chromeDriver.quit();
    }

    @Test
    public void testWebFormPage() {
        // Navigate to this example website which is a form.
        chromeDriver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }
}
