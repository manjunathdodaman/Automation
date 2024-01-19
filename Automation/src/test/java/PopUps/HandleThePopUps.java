package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class HandleThePopUps {

	WebDriver driver;
	@BeforeMethod
	public void executeBeforeMethod() {
  //ChromeOptions	Options	= new ChromeOptions();
  //Options.addArguments("--disable-notifications");
    // driver = new ChromeDriver(Options);
	driver	= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	     
	}
	@AfterMethod
	public void executeAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
	}
	@Test
	public void alertPopUp() throws Throwable {
		//inspect -- No
		//Drag -- No
		//Blockade --Yes
		driver.get("");
		Thread.sleep(1000);
	String	alertMsg = driver.switchTo().alert().getText();
	System.out.println("alertMsg="+alertMsg);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	}
	@Test
	public void confirationPopUp() throws Throwable {
		driver.get("");
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
	}
	@Test
	public void promptPopUp() throws Throwable {
		driver.get("");
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("100");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	@Test
	public void hiddenDivisionPopUp() throws Throwable {
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
//Actions	actions	= new Actions(driver);
//actions.click().perform();
//Thread.sleep(2000);
WebElement		closeoption = driver.findElement(By.xpath("//span[text()='x']"));
closeoption.click();
Thread.sleep(2000);


		
	}
	@Test
	public void notificationPopUp() throws Throwable {
		driver.get("https://www.ajio.com/");
		
	}
	public void fileUploadPopUp() throws Throwable {
		driver.get("https://demo.guru99.com/test/upload/");
	WebElement	chooseFileTextFile = driver.findElement(By.id("uploadfile_0"));
	chooseFileTextFile.sendKeys("");
	Thread.sleep(2000);
	 driver.findElement(By.id("submitbutton")).click();
	 Thread.sleep(2000);
	}
}
