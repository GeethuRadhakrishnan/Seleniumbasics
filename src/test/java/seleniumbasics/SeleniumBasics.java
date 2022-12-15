package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumBasics {
    WebDriver driver;

    public void testInitialize(String browser) {
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("edge")) {
            driver = new EdgeDriver();
        } else {
            try {
                throw new Exception("Invalid Browser");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @BeforeMethod
    public void setUp() {
        testInitialize("chrome");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void TC_001_verifyObsquraTitle() {
        driver.get("https://selenium.obsqurazone.com/index.php");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Obsqura Testing";
        Assert.assertEquals(actualTitle, expectedTitle, "Invalid Title found");
    }

    @Test
    public void TC_002_verifySingleInputFieldMessage() {
        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
        WebElement messageField = driver.findElement(By.id("single-input-field"));
        messageField.sendKeys("Test");
        WebElement showMessage = driver.findElement(By.id("button-one"));
        showMessage.click();
        WebElement message = driver.findElement(By.id("message-one"));
        String myMessage = message.getText();
        System.out.println(myMessage);
        String actualMessage = myMessage;
        String expectedMessage = "Your Message : Test";
        Assert.assertEquals(actualMessage, expectedMessage, "Invalid message found");
    }
    @Test
    public void TC_003_verifyTotal(){
        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
        WebElement textValue=driver.findElement(By.id("value-a"));
        textValue.sendKeys("10");
        WebElement textValue2=driver.findElement(By.id("value-b"));
        textValue2.sendKeys("20");
        WebElement getTotalButton= driver.findElement(By.id("button-two"));
        getTotalButton.click();
        WebElement total= driver.findElement(By.id("message-two"));
        String totalValue= total.getText();
        String actualValue= totalValue;
        String expectedValue = "Total A + B : 30";
        Assert.assertEquals(actualValue, expectedValue, "Invalid message found");
    }
}

