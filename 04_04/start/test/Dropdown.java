import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgera\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
        dropDown.click();

        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.click();

        Thread.sleep(5999);
        driver.quit();
    }
}
