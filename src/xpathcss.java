import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathcss {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Browser drivers\\geckodriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://fdatrainingalert.com/ecommerce/control/login");
		
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testvijay@testvijay.com");
		
		//driver.findElement(By.xpath("//*[@id='cofda-main-container']/div[4]/div/div/form/label[2]/input")).sendKeys("password");
		
		//driver.findElement(By.xpath("//*[@id='cofda-main-container']/div[4]/div/div/form/label[3]/input")).click();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("testvijay@testvijay.com");
		
		driver.findElement(By.cssSelector(".mainsign_in_form > label:nth-child(2) > input:nth-child(1)")).sendKeys("123456");
		
		driver.findElement(By.cssSelector(".maincheckout_button")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#content-messages > p:nth-child(1)")).getText());

	}

}
