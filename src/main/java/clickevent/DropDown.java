package clickevent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//b[text()='Recruitment']")).click();
		
		Thread.sleep(1000);
		Select sc = new Select(driver.findElement(By.xpath("//select[@id='candidateSearch_jobTitle']")));
		sc.selectByIndex(4);
		Thread.sleep(1000);
		
			
		Select sc1 = new Select(driver.findElement(By.xpath("//select[@id='candidateSearch_status']")));
		sc1.selectByValue("INTERVIEW PASSED");
		
		Thread.sleep(1000);
		Select sc2 = new Select(driver.findElement(By.xpath("//select[@id='candidateSearch_modeOfApplication']")));
		sc2.selectByVisibleText("Manual");
		
		
		
		
		
	}

}
