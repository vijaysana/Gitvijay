import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathParentChildTraverse {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.findElement(By.xpath("//div[@jscontroller='iDPoPb']/div/input")).sendKeys("fda");
		
	
		

	}

}
