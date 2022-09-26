package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.ca/");
		
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		WebElement scroll = driver.findElement(By.xpath("//span[text()='Blockbuster Blu-ray']"));
		String str= scroll.getText();
		
		System.out.println(str);
		Thread.sleep(1000);
		
        act.sendKeys(Keys.PAGE_UP).build().perform();
		
		WebElement scroll1 = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		String str1= scroll1.getText();
		System.out.println(str1);
		
	}

}

/*JavascriptExecutor js=(JavascriptExecutor) driver
//js.executeScript(“window.scollBy(0,500)”); // scroll down by 1000 pixels
//js.executeScript(“arguments[0].scrollIntoView();”,Element); // scroll the page till the element is found
js.executeScript(“window.scollTo(0,document.body.scollHeight)”); // scroll the web page till end.*/

