package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PopUpLogin {
	WebDriver driver;
//@Test
	public void configChrome() throws IOException {
		//WebDriver driver;
		driver = new ChromeDriver();
		String domain = "the-internet.herokuapp.com/basic_auth";
		String username = "admin";
		String password = "admin";
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.xpath("a"));
		//String[] arrr = list.toArray();
		for(WebElement e:list) {
			System.out.println(e.getAttribute("href"));
		}
		WebElement elem = driver.findElement(By.xpath("//select[@name='cars']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",elem);
		Select sel = new Select(elem);
		sel.selectByVisibleText("Audi");
		screenshot();
		System.out.println(sel.isMultiple());
		
		System.out.println(list.size());
		//driver.quit();
		WebElement text = driver.findElement(By.xpath("//div/p"));
		String msg = text.getText().trim();
		
		Assert.assertEquals(msg, "Congratulations! You must have the proper credentials.", "Test Pass");
	}
	public void screenshot() throws IOException {
		Date date = new Date();
		SimpleDateFormat sdate = new SimpleDateFormat("ddMMyyyyhhmmss");
		String suffix = sdate.format(date);
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(".//Screenshots//screen"+suffix+".png");
		FileUtils.copyFile(src, dest);
	}
	@Test(priority=1)
	public void takeExcelData() throws IOException {
		File path = new File("C:\\Users\\akuma409\\Desktop\\Work\\HON_SMOC\\Docs\\TestExcel.xlsx");
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		Row r1 = sheet.getRow(0);
		Cell cell = r1.getCell(0);
		String s1 = cell.getStringCellValue();
		cell.setBlank();
		
		System.out.println(s1);
		FileOutputStream fos = new FileOutputStream(path);
		
		XSSFSheet s2 = wb.createSheet("NewSheet");
		Row r2 = s2.createRow(0);
		r2.createCell(0).setCellValue("Serial No");
		r2.createCell(1).setCellValue("Name");
		r2.createCell(2).setCellValue("Email");
		wb.write(fos);
		fos.close();
		
		
	}
	
	{
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//path")));
		//Fluent wait
		Wait<WebDriver> wait1 = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(300))
				.ignoring(NoSuchElementException.class);
		wait1.until(ExpectedConditions.elementToBeSelected(By.xpath("//dsfsdf")));
		
	}
}
