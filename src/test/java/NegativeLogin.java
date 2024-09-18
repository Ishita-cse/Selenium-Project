import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NegativeLogin {
    @Test
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("Https://app.vwo.com");
        driver.findElement(By.id("login-username")).sendKeys("Admin@admin.com");
        driver.findElement(By.id("login-password")).sendKeys("Admin");
        driver.findElement(By.id("js-login-btn")).click();
        Assert.assertEquals(driver.getTitle(),"LOGIN - VWO");
  driver.quit();
try{
    Thread.sleep(500);

} catch (Exception e) {
    throw new RuntimeException(e);
}
 //Verify
        WebElement errormessage =driver.findElement(By.id("js-notification-box-msg"));
        Assert.assertEquals(errormessage.getText(),"Your email, password, IP address or location did not match");


    }
}
