package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Google {

	public static void search() {

		// WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("selenium");

		new Actions(driver).sendKeys(Keys.ESCAPE).build().perform();
		new Actions(driver).sendKeys(Keys.ESCAPE).build().perform();

		new Actions(driver).sendKeys(Keys.ENTER).build().perform(); // alt="Google"

		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Selenium']")).isDisplayed());
		
		driver.close();

	}

}
