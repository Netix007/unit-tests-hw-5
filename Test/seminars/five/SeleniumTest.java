package seminars.five;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class SeleniumTest {
    @Test
    public void testSeleniumLink() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.ru/");
        WebElement webElement = webDriver.findElement(By.className("gLFyf"));
        webElement.sendKeys("Selenium");
        webElement.submit();
        webElement = webDriver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/cite"));

        assertThat(webElement.getText()).isEqualTo("https://www.selenium.dev");
        webDriver.quit();
    }

    @Test
    public void seleniumTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com/");
        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        webElement.sendKeys("standard_user");
        webElement = webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
        webElement.sendKeys("secret_sauce");
        webElement = webDriver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        webElement.submit();
        webElement = webDriver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

        assertThat(webElement.getText()).isEqualTo("Products");
        webDriver.quit();
    }
}
