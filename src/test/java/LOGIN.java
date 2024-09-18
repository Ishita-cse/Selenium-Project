import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class LOGIN {
    @Test
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.findElement(By.id("login-username")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("abc@12;" );

                driver.findElement(By.id("js-login-btn")).click();

//Freetrial

        WebElement freeTrial= driver.findElement(By.linkText("Start a free trial"));
        freeTrial.click();
    }
}
