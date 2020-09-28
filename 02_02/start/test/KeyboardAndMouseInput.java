import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        String s = System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgera\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Dennis");

        driver.quit();
    }
}
