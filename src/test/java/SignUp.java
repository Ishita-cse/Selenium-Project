import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SignUp {
    @Test
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");

        WebElement signup= driver.findElement(By.linkText("Start a free trial"));
        signup.click();

        WebElement email= driver.findElement(By.id("page-v1-step1-email"));
       email.sendKeys("rejino9777@sigmazon.com");

           WebElement checkbox= driver.findElement(By.id("gdpr_consent_checkbox"));
           checkbox.click();

        List<WebElement> button=driver.findElements(By.tagName("button"));
        button.get(0).click();


    }
}
