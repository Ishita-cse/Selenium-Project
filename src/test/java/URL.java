import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class URL {
    @Test
    public void VWOURL(){
      WebDriver driver = new ChromeDriver();
      driver.get("https:\\app.vwo.com");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }
}
