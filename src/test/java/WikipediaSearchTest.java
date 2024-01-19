import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class WikipediaSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://qawikisearch.ccbp.tech/");

        WebElement inputE=driver.findElement(By.xpath("//input[@id='searchInput']"));
        inputE.sendKeys("HTML");

        WebElement buttonE=driver.findElement(By.xpath("//button[@id='submitButton']"));

        buttonE.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='result-item']")));

        List<WebElement> resultE=driver.findElements(By.xpath("//div[@class='result-item']"));
        System.out.println(resultE.size()+" Results Found");


        driver.quit();

    }
}
