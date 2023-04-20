package de.ithoc.training.selenium.innovationlab;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;



public class WebFormTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Create driver with the option to allow remote origins.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        // Navigate to this example website which is a form.
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        // Wait a little to ensure website has been loaded.
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    }
}
