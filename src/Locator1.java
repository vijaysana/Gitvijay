import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("vijaysana25@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.linkText("Forgotten account?")).click();
	
		

	}

}
