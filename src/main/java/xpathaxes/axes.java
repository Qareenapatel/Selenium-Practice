package xpathaxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class axes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(1500);
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		Thread.sleep(1500);
		
		//self node
		String text1 = driver.findElement(By.xpath("//a[text()='Garry.White']/self::a")).getText();
		System.out.println(text1);
		
		//parent node
		text1 = driver.findElement(By.xpath("//a[text()='Garry.White']/parent::td")).getText();
		System.out.println(text1);
		
		//child node
		text1 = driver.findElement(By.xpath("//a[text()='Garry.White']/ancestor::tr/child::td[2]")).getText();
		System.out.println(text1);
		
		//ancestor node
		text1 = driver.findElement(By.xpath("//a[text()='Garry.White']/ancestor::tr")).getText();
		System.out.println(text1);
		
		//descendant node
		//text1 = driver.findElement(By.xpath("//a[text()='Garry.White']/ancestor::tr/descendant::td[2]")).getText();
		//System.out.println(text1);
		
		List<WebElement> descendant = driver.findElements(By.xpath("//a[text()='Garry.White']/ancestor::tr/descendant::td[2]"));
		System.out.println(descendant.size());
		
		//following
		text1 = driver.findElement(By.xpath("//a[text()='Garry.White']/ancestor::tr/following::tr")).getText();
		System.out.println(text1);
		
		List<WebElement> following = driver.findElements(By.xpath("//a[text()='Garry.White']/ancestor::tr/following::tr"));
		System.out.println(following.size());
		
		//following-siblings
		List<WebElement> followingsibling = driver.findElements(By.xpath("//a[text()='Garry.White']/ancestor::tr/following-sibling::tr"));
		System.out.println(followingsibling.size());
		
		//preceding
		List<WebElement> preceding = driver.findElements(By.xpath("//a[text()='Garry.White']/ancestor::tr/preceding::tr"));
		System.out.println(preceding.size());
		
		//preceding-siblings
		List<WebElement> precedingsibling = driver.findElements(By.xpath("//a[text()='Garry.White']/ancestor::tr/preceding-sibling::tr"));
		System.out.println(precedingsibling.size());
		
		
		
		
	}

	
}
