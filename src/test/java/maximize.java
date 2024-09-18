import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class maximize {
    public static void main(String[] args) throws InterruptedException {
ChromeOptions Options = new ChromeOptions();
//Options.addArguments("--guest");
        Options.addArguments("--start-maximized");



        WebDriver driver= new ChromeDriver(Options);
        driver.get("https://www.google.com");
//driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.quit();

    }
}
