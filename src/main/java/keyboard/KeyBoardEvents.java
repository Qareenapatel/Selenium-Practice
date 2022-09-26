package keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		Actions act = new Actions(driver);

		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		// username.click();

		act.moveToElement(username).keyDown(username, Keys.SHIFT).sendKeys("admin").keyUp(username, Keys.SHIFT).build()
				.perform();

		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.click();

		act.keyDown(password, Keys.SHIFT).sendKeys("admin123").keyUp(password, Keys.SHIFT).build().perform();

		driver.findElement(By.xpath("//input[@name='Submit']")).click();

	}

}
