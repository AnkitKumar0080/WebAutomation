package Practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

public class TakeScreenshot {

	public void takeScreensht() throws IOException {
		WebDriver driver = new ChromeDriver();
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(".//Screenshots//dateS.png");
		FileUtils.copyFile(src,dest);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(0));
		//wait.until(visibilityOfElement(locatedBy(xpath(""))));)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		Wait<WebDriver> fwait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class);
		fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	}
}
