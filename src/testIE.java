import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testIE {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.ie.driver", "C:\\Browser drivers\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		

	}

}
