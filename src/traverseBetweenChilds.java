import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class traverseBetweenChilds {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://complianceonline.com/webinar-training/banking-and-financial-services-10004-c");
		
		//driver.findElement(By.xpath("//div[@class='sub-categories']//a[contains(text(),'Banks and Credit Unions')]")).click();
		
		//driver.findElement(By.xpath("//div[@class='sub-categories']/a/following-sibling::a[contains(text(),'Accounting and Taxation')]")).click();
		
		//driver.findElement(By.xpath("//div[@class='sub-categories']/a[contains(text(), 'Insurance')]")).click();
		
		driver.findElement(By.xpath("//div[@class='sub-categories']//a[contains(text(),'Financial Services and Trading')]/parent::div"));
		

	}

}
