import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		//driver.findElement(By.id("fromCity"));
		
		WebElement source=driver.findElement(By.id("fromCity"));
		
		//source.clear();
		
		source.sendKeys("MUM");
		
		Thread.sleep(2000);
		
		source.sendKeys(Keys.ARROW_DOWN);
		
		source.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.id("toCity"));
		
		WebElement destination=driver.findElement(By.id("toCity"));
		
		//destination.clear();
		
		destination.sendKeys("DEL");
		
		Thread.sleep(2000);
		
		destination.sendKeys(Keys.ARROW_DOWN);
		
		destination.sendKeys(Keys.ENTER);
		
		
		
		
		
		

	}

}
