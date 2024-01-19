package ScreenShotAs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewScreenShot {

	public static void main(String[] args) throws IOException {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.the-maharajas.com/");
String timeStamp = LocalTime.now().toString().replace(":", "-");

TakesScreenshot ts = (TakesScreenshot)driver;
File tempFile= ts.getScreenshotAs(OutputType.FILE);
File permFile = new File("./manyogi/"+timeStamp+"maharajas.png");
FileUtils.copyFile(tempFile, permFile);
driver.quit();

	}

}
