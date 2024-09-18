import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Navigate {
    @Test
    public void navigate(){
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 =new EdgeDriver();
        driver.get("https://www.google.com");
        WebElement searchbox= driver.findElement(By.className("gLFyf"));
        searchbox.sendKeys("aap.vwo.com");
        searchbox.sendKeys(Keys.ENTER);
        driver.navigate().to("https://app.vwo.com/#/login");
        driver.navigate().back();
        driver.navigate().forward();

        driver1.get("https://www.google.com");
        WebElement searchbox1= driver1.findElement(By.className("gLFyf"));
        searchbox1.sendKeys("aap.vwo.com");
        searchbox1.sendKeys(Keys.ENTER);
        driver.navigate().to("https://app.vwo.com/#/login");
        driver.navigate().back();
        driver.navigate().forward();



    }
}
