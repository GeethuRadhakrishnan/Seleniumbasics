package seleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

    public static void main(String[] args) {


        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://selenium.nbobsqurazone.com/simple-form-demo.php");
        WebElement messageField = driver.findElement(By.id("single-input-field"));
        messageField.sendKeys("Test");
        WebElement showMessage = driver.findElement(By.id("button-one"));
        showMessage.click();
        WebElement message= driver.findElement(By.id("message-one"));
        String myMessage=message.getText();
        System.out.println(myMessage);
        WebElement textValue=driver.findElement(By.id("value-a"));
        textValue.sendKeys("10");
        WebElement textValue2=driver.findElement(By.id("value-b"));
        textValue2.sendKeys("20");
        WebElement getTotalButton= driver.findElement(By.id("button-two"));
        getTotalButton.click();
        WebElement total= driver.findElement(By.id("message-two"));
        String totalValue= total.getText();



        //driver.close();
    }
}
