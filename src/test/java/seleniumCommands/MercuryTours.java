package seleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement register= driver.findElement(By.linkText("REGISTER"));
        register.click();
        WebElement firstName= driver.findElement(By.name("firstName"));
        firstName.sendKeys("Geethu");
        WebElement lastname=driver.findElement(By.name("lastName"));
        lastname.sendKeys("Krishna R");
        WebElement phone=driver.findElement(By.name("phone"));
        phone.sendKeys("9443307232");
        WebElement email=driver.findElement(By.name("userName"));
        email.sendKeys("geethukrishnar96@gmail.com");
        WebElement address= driver.findElement(By.name("address1"));
        address.sendKeys("Kazhakootam");
        WebElement city= driver.findElement(By.name("city"));
        city.sendKeys("Trivandrum");
        WebElement state= driver.findElement(By.name("state"));
        state.sendKeys("Kerala");
        WebElement postalCode= driver.findElement(By.name("postalCode"));
        postalCode.sendKeys("695582");
        WebElement username= driver.findElement(By.name("email"));
        username.sendKeys("geethukrishnar96@gmail.com");
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("MercuryTours123");
        WebElement confirmPassword= driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("MercuryTours123");
        WebElement submitButton= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
        submitButton.click();
        driver.close();
    }
}
