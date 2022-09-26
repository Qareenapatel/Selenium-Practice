package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Actions act = new Actions(driver);

		WebElement admin = driver.findElement(By.xpath("//b[text()='Admin']"));
		WebElement usermanag = driver.findElement(By.xpath("//a[text()='User Management']"));
		WebElement user = driver.findElement(By.xpath("//a[text()='Users']"));

		act.moveToElement(admin).build().perform();
		Thread.sleep(1000);
		act.moveToElement(usermanag).build().perform();
		Thread.sleep(1000);
		act.moveToElement(user).click().build().perform();

	}

}
