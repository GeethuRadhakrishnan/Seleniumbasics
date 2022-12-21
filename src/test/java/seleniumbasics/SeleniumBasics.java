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
@Test
    public void TC_004_formSubmit(){
        driver.get("https://selenium.obsqurazone.com/form-submit.php");
        WebElement firstName=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
        firstName.sendKeys("Geethu");
        WebElement lastName=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
        lastName.sendKeys("Krishna");
        WebElement username= driver.findElement(By.xpath("//input[contains(@id,'validationCustomUsername')]"));
        username.sendKeys("GeethuR");
        WebElement city= driver.findElement(By.xpath("//input[starts-with(@placeholder,'City')]"));
        city.sendKeys("Kozhikode");
        WebElement state= driver.findElement(By.xpath("//input[@class='form-control'and@placeholder='State']"));
        state.sendKeys("Kerela");
        WebElement zipcode= driver.findElement(By.xpath("//div[@class='col-md-3 mb-3']/input[@id='validationCustom05']"));
        zipcode.sendKeys("123456");
        WebElement acceptButton= driver.findElement(By.xpath("//div[@class='form-check']/input[@id='invalidCheck']"));
        acceptButton.click();
        WebElement submitButton=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
        submitButton.click();
        WebElement submitMsg= driver.findElement(By.xpath("//div[@id='message-one']"));
        String submitMessage=submitMsg.getText();
        String actualText= submitMessage;
        String expectedText="Form has been submitted successfully!";
        Assert.assertEquals(actualText,expectedText,"Invalid message found");
    }
@Test
    public void TC_005_submitFormWithoutFilling() {
        driver.get("https://selenium.obsqurazone.com/form-submit.php");
        //WebElement firstName=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
        WebElement submitButton=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
        submitButton.click();
        WebElement submitMsg= driver.findElement(By.xpath("//div[@id='message-one']"));
        String submitMessage=submitMsg.getText();
        WebElement errorMsg=driver.findElement(By.xpath("//div[contains(@class,'invalid-feedback')]"));
        String errorMessage= errorMsg.getText();
        String actualErrorMessage= errorMessage;
        String expectedErrorMessage="Please enter First name.";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"Invalid message found");
    }
    @Test
    public void TC_006_submitFormWithoutFillingState(){
        driver.get("https://selenium.obsqurazone.com/form-submit.php");
        WebElement firstName=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
        firstName.sendKeys("Geethu");
        WebElement lastName=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
        lastName.sendKeys("Krishna");
        WebElement username= driver.findElement(By.xpath("//input[contains(@id,'validationCustomUsername')]"));
        username.sendKeys("GeethuR");
        WebElement city= driver.findElement(By.xpath("//input[starts-with(@placeholder,'City')]"));
        city.sendKeys("Kozhikode");
        WebElement state= driver.findElement(By.xpath("//input[@class='form-control'and@placeholder='State']"));
        WebElement zipcode= driver.findElement(By.xpath("//div[@class='col-md-3 mb-3']/input[@id='validationCustom05']"));
        zipcode.sendKeys("123456");
        WebElement acceptButton= driver.findElement(By.xpath("//div[@class='form-check']/input[@id='invalidCheck']"));
        acceptButton.click();
        WebElement submitButton=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
        submitButton.click();
        WebElement submitMsg= driver.findElement(By.xpath("//div[@id='message-one']"));
        String submitMessage=submitMsg.getText();
        WebElement errorMsg1=driver.findElement(By.xpath("//div[@class='col-md-3 mb-3']/div[@class='invalid-feedback']"));
        String errorMessage1= errorMsg1.getText();
        String actualErrorMessage= errorMessage1;
        String expectedErrorMessage="Please provide a valid state.";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"Invalid message found");
    }
}

