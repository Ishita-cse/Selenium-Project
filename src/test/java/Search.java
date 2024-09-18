import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Search {
    @Test
public void Search(){
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
        WebElement searchbox= driver.findElement(By.className("gLFyf"));
        searchbox.sendKeys("app.vwo");
        searchbox.sendKeys(Keys.ENTER);

    }


}
