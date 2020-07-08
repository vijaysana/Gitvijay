import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customxpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://fdatrainingalert.com/ecommerce/control/login");
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("testvijay@testvijay.com");
		
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
		

		
	}

}
