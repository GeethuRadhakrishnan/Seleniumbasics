package seleniumCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicCommands {
    public static void main(String[] args) {
       // String driverPath= System.getProperty(user.dir);
        //WebDriver driver=new ChromeDriver();
       // driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
       // driver.manage().window().maximize();
        //driver.close();

        WebDriver driver1 = new EdgeDriver();
        // driver1.get("https://selenium.obsqurazone.com/simple-form-demo.php");
         driver1.manage().window().maximize();
        driver1.close();
    }
}
