package xpathlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Or {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@name='txtUsername' or @id='txtUsername1']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword' or @type='password2']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit' or @name='Submit3']")).click();

	}

}
