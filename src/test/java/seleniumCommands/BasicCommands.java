package seleniumCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicCommands {
    public static void main(String[] args) {
        WebDriver driver;
        // String driverPath= System.getProperty(user.dir);
        driver = new ChromeDriver();
        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
        driver.manage().window().maximize();
        driver.close();
        /**Launching Edge browser**/
        driver = new EdgeDriver();
        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
        driver.manage().window().maximize();
        driver.close();
    }
}
