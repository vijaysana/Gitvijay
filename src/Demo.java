import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
				
		//set property for chrome browser driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		//Set object for the class
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");       //hits the URL
		
		System.out.println(driver.getTitle());		//gets the title of the page
		
		System.out.println(driver.getCurrentUrl());	//gets the current URL in the browser
		
		//System.out.println(driver.getPageSource()); //gets the page source 
		
		driver.get("http://yahoo.com");  //hits the URL
		
		driver.navigate().back(); 		//Navigates back to previous page
		
		driver.navigate().forward();
		
		driver.close();

	}

}
