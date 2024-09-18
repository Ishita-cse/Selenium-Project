import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoad {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        //options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        //options.setPageLoadStrategy(PageLoadStrategy.NONE);
       options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver =new ChromeDriver(options);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
