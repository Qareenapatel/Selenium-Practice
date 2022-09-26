package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act= new Actions(driver);
		
		WebElement washing=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement usa = driver.findElement(By.xpath("//div[@id='box103']"));
		
		Thread.sleep(1000);
		act.clickAndHold(washing).moveToElement(usa).release().build().perform();
		
		//act.dragAndDrop(washing, usa).build().perform();
		
	}

}
