package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Facebook {

	public static void loadLoaginPage() {

		// WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		Assert.assertTrue(driver.findElement(By.id("u_0_m")).isDisplayed(),
				"First name field is not showing on the page.");

		driver.close();

	}

}
