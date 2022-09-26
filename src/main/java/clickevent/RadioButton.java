package clickevent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//b[text()='My Info']")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
		/*WebElement male= driver.findElement(By.xpath("//label[text()='Male']"));
		WebElement female= driver.findElement(By.xpath("//label[text()='Female']"));
		
		//male.click();
		female.click();*/
		
		//or
		
		
		//female
		System.out.println(driver.findElement(By.xpath("//label[text()='Female']")).isSelected());
		//male
		System.out.println(driver.findElement(By.xpath("//label[text()='Male']")).isSelected());
		
		
		
		//select female radio button
		if (driver.findElement(By.xpath("//label[text()='Female']")).isSelected()==false)
		{
			driver.findElement(By.xpath("//label[text()='Female']")).click();
		}
		
	}


	}


