 package ActionsClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleDropDowns {
WebDriver driver;
@BeforeMethod
public void exceuteBeforeMethod() throws InterruptedException {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	  driver.get("https://www.facebook.com/signup");
	Thread.sleep(2000);
	
	
}
@AfterMethod
public void executeAfterMethod() {
	driver.manage().window().minimize();
	driver.quit();  
}
@Test 
public void checkTheStateOfTheDropDown() {
WebElement	monthDropDown = driver.findElement(By.id("month"));
       Select monthSelect= new Select(monthDropDown);
       if (monthSelect.isMultiple()) {
    	   System.out.println("Pass: the drop down is multi select drop down");
    	   }else {
			System.out.println("Fail:the drop down is single select drop down");
		}

	
}
@Test
public void selectShivasBday() throws InterruptedException {
WebElement	dayDropDown= driver.findElement(By.id("day"));
  Select daySelect = new Select(dayDropDown);
  daySelect.selectByIndex(1);
  Thread.sleep(2000);
 WebElement monthDropDown = driver.findElement(By.id("month"));
Select monthSelect = new Select(monthDropDown);
monthSelect.selectByValue("12");
Thread.sleep(2000);
WebElement yearDropDown = driver.findElement(By.id("year"));
 Select yearSelect = new Select(yearDropDown);
 yearSelect.selectByVisibleText("1997");
 Thread.sleep(2000);

  
}
@Test
public void captureTheSelectedOption() {
	 WebElement monthDropDown = driver.findElement(By.id("month"));
	 Select monthSelect = new Select(monthDropDown);
String	defaultMonthOption = monthSelect.getFirstSelectedOption().getText();
System.out.println("defaultMonthOption="+defaultMonthOption);
	 
}
@Test
public void captureTheSelectedDayOption() {
	WebElement dayDropDown = driver.findElement(By.id("day"));
	   Select   daySelect = new Select(dayDropDown);
	String defaultDayOption = daySelect.getFirstSelectedOption().getText();
	System.out.println("defaultDayOption="+defaultDayOption);
}
@Test
public void captureTheselectedYearOption() {
	WebElement yearDropDown = driver.findElement(By.id("year"));
Select  yearSelect	= new Select(yearDropDown);
String defaultYearOption = yearSelect.getFirstSelectedOption().getText();
System.out.println("defaultYearOption="+defaultYearOption);
}
@Test   
public void captureAllTheOptionsFromDropDown() {
	  WebElement yearDropDown = driver.findElement(By.id("year"));
Select	yearSelect = new Select(yearDropDown);
  List<WebElement> allYearOptions = yearSelect.getOptions();
   System.out.println(allYearOptions.size());

 for (WebElement opt : allYearOptions) {
	String optTagText = opt.getText();
	System.out.println(optTagText);
	}
	}
@Test
public void selectAllTheOptions() throws InterruptedException {
WebElement carsDropDown	= driver.findElement(By.id("cars"));
  Select carsSelect = new Select(carsDropDown);
  carsSelect.selectByIndex(0);
  Thread.sleep(1000);
  carsSelect.selectByIndex(1);
  Thread.sleep(1000);
  carsSelect.selectByIndex(2);
  Thread.sleep(1000);
  carsSelect.selectByIndex(3);
  Thread.sleep(1000);
  carsSelect.deselectAll();
  carsSelect.deselectByIndex(0);
  Thread.sleep(1000);
  carsSelect.selectByValue("opel");
  Thread.sleep(1000);
  carsSelect.selectByValue("volvo");
  Thread.sleep(1000);
  carsSelect.selectByValue("audi");
  Thread.sleep(1000);
  carsSelect.deselectByValue("opel");
  Thread.sleep(1000);
}
}

