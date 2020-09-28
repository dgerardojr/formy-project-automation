import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgera\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Test");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Best Test");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Tester");

        WebElement levelEducation = driver.findElement(By.id("radio-button-2"));
        levelEducation.click();

        WebElement sex = driver.findElement(By.id("checkbox-1"));
        sex.click();

        Thread.sleep  (5999);


        driver.quit();
    }
}
