import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Open_Browers {
    @Test
            public static void main(String[] args){
        WebDriver driver =new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

    }


}
