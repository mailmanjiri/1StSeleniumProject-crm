package NewConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
	
	WebDriver driver;
	
	@Before
	public void init() {   
				System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
				driver= new ChromeDriver();
				
				driver.manage().deleteAllCookies();
				// Launch the application
				driver.get("https://www.techfios.com/billing/?ng=admin/");
				// maximize the window
				driver.manage().window().maximize();
				
				//wait
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
	}
	
	@Test
	public void positiveLogin() throws InterruptedException {
		

			    driver.findElement(By.cssSelector("input#username")).sendKeys("demo@techfios.com");
			    driver.findElement(By.cssSelector("input#password")).sendKeys("abc123");
			    driver.findElement(By.cssSelector("button[name='login']")).click();
			    Thread.sleep(3000);
			    
		    driver.findElement(By.cssSelector("#side-menu > li.active > a > span.nav-label")).click();
		   // driver.findElement(By.cssSelector("a[href$='https://techfios.com/billing/?ng=accounts/add/']")).click();
		    
		    //$['span:contains("Bank & Cash")']

			  

			
				
	}
	

}
