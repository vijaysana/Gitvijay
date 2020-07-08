import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Browser drivers\\geckodriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//WebDriver driver=new ChromeDriver();
		
		driver.get("http://fdatrainingalert.com/ecommerce/control/login");
		
		driver.findElement(By.id("email")).sendKeys("testvijay@testvijay.com");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("password");
		
		//driver.findElement(By.className("maincheckout_button")).click();
		
		driver.findElement(By.xpath("//*[@id='cofda-main-container']/div[4]/div/div/form/label[3]/input")).click();
		
		
		

	}
}	
	
