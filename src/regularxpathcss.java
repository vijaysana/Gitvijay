import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class regularxpathcss {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://complianceonline.com/ecommerce/control/login");
		
		//driver.findElement(By.xpath("//input[contains(@class,'sign_in_input')]")).sendKeys("testvijay@testvijay.com");
		
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("password");
		
		//driver.findElement(By.xpath("//input[contains(@id,'submitbutton')]")).click();
		
		driver.findElement(By.cssSelector("input[class*='sign_in_input']")).sendKeys("testvijay@testvijay.com");
		
		driver.findElement(By.cssSelector("input[id*='submitbutton']")).click();
		

	}

}
