package seleniumCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicCommands {
    public static void main(String[] args) {
        WebDriver driver;
        // String driverPath= System.getProperty(user.dir);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://selenium.obsqurazone.com/index.php");
        String currentUrl= driver.getCurrentUrl();
        String title =driver.getTitle();
        String sourceCode=driver.getPageSource();
        System.out.println(currentUrl);
        System.out.println(title);
        System.out.println(sourceCode);
        driver.close();

        /**Launching Edge browser**/
//        driver = new EdgeDriver();
//        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
//        driver.manage().window().maximize();
//        driver.close();
    }
}
