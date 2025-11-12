package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PopUpLogin {
@Test
	public void configChrome() {
		WebDriver driver;
		driver = new ChromeDriver();
		String domain = "the-internet.herokuapp.com/basic_auth";
		String username = "admin";
		String password = "admin";
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		WebElement text = driver.findElement(By.xpath("//div/p"));
		String msg = text.getText().trim();
		
		Assert.assertEquals(msg, "Congratulations! You must have the proper credentials.", "Test Pass");
	}
}
