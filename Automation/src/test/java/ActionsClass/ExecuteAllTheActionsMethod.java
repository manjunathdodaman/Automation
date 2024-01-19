package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExecuteAllTheActionsMethod {
WebDriver driver;

@BeforeMethod
public void executeBeforeMethod() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
}
@AfterMethod
public void executeAfterMethod() {
	driver.manage().window().minimize();
	driver.quit();
	
}
@Test
public void clickAction() throws InterruptedException {
	driver.get("https://www.facebook.com/");
WebElement  loginButton	= driver.findElement(By.name("login"));
 Actions actions = new Actions(driver);
 actions.click(loginButton).perform();
 Thread.sleep(2000);
	
}
@Test
public void sendKeysDemo() throws InterruptedException {
	driver.get("https://www.facebook.com/");
WebElement emailTextField = driver.findElement(By.id("email"));
WebElement passwordTextField = driver.findElement(By.name("pass"));
  WebElement loginButton = driver.findElement(By.name("login"));
Actions actions = new Actions(driver);

actions.sendKeys(driver.switchTo().activeElement()).sendKeys("SRHFUCKERSSS").sendKeys(passwordTextField,"12345678").click(loginButton).perform();
Thread.sleep(2000);


	
}
@Test
public void dragAndDropDemo() throws InterruptedException {
	driver.get("https://jqueryui.com/draggable/");
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
	 jse.executeScript("window.scrollBy(0,400)");
	  Thread.sleep(2000);
	  driver.switchTo().frame(0);
WebElement	draggableEle = driver.findElement(By.id("draggable"));
 Actions actions = new Actions(driver);
 actions.dragAndDropBy(draggableEle, 150, 200).perform();
	 
}
@Test
public void doubleClick() {
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  WebElement doubleEle = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    Actions actions = new Actions(driver);
	    actions.doubleClick(doubleEle).perform();
}
@Test
public void contextClick() {
	driver.get("https://www.facebook.com/");
WebElement	loginButton = driver.findElement(By.name("login"));
Actions actions = new Actions(driver);
actions.contextClick().perform();
actions.contextClick(loginButton).perform();
}
@Test
  public void moveToEle() {
	driver.get("https://www.myntra.com/");
WebElement menOption	= driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
 WebElement womenOption= driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Women']"));
 WebElement kidsOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Kids']"));
 WebElement homeAndLivingOption= driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Home & Living']"));
 WebElement beautyOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Beauty']"));
 WebElement studioOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Studio']"));
Actions acitons = new Actions(driver);
acitons.moveToElement(menOption, 0, 0).pause(1000).moveToElement(menOption, 73, 0).pause(1000).moveToElement(womenOption, 74, 0).pause(1000).moveToElement(kidsOption, 97, 0).pause(1000).moveToElement(homeAndLivingOption, 107, 0).pause(1000).pause(1000).moveToElement(homeAndLivingOption, 107, 0).pause(1000).moveToElement(beautyOption, 87, 0).pause(1000).build().perform();
acitons.moveToElement(menOption).pause(1000).moveToElement(womenOption).pause(1000).moveToElement(kidsOption).pause(1000).moveToElement(homeAndLivingOption).pause(1000).moveToElement(beautyOption).pause(1000).moveToElement(studioOption).pause(1000).build().perform();

}
@Test
public void clickAndHoldWithRelease() throws InterruptedException {
	driver.get("https://jqueryui.com/draggable/");
	Thread.sleep(1000);
JavascriptExecutor	jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,400)");
Thread.sleep(1000);
driver.switchTo().frame(0);
WebElement draggableEle = driver.findElement(By.id("draggable"));
        WebElement droppableEle = driver.findElement(By.id("droppable"));
      Actions actions = new Actions(driver);
      actions.clickAndHold(draggableEle).release(droppableEle).perform();
      Thread.sleep(1000);
      
	
}
}
 
 

