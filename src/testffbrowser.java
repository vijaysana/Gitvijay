import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testffbrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Browser drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://complianceonline.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		
		//test vijay new develop

	}

}
