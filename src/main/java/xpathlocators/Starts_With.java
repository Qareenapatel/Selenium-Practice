package xpathlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Starts_With {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[starts-with(@name,'txtU')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[starts-with(@name,'txtP')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[starts-with(@type,'subm')]")).click();

	}

}
