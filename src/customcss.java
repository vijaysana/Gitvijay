import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class customcss {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Browser drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://fdatrainingalert.com/ecommerce/control/login");
		
		driver.findElement(By.cssSelector("[id='email']")).sendKeys("testvijay@testvijay.com");
		
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("password");
		
		driver.findElement(By.cssSelector("[value='Submit']")).click();
		
		

	}

}
