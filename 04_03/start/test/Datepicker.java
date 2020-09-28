import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static java.lang.Thread.*;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgera\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("09/23/2020");
        dateField.sendKeys(Keys.RETURN);

        sleep(3000);
        driver.quit();
    }
}