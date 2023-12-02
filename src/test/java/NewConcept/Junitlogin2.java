package NewConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitlogin2 {

	static WebDriver driver;
	
	@Before
	public void init() {   //init- initialize, 
		// set system property
				System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
				driver= new ChromeDriver();
				// delete cookies has to happen before going to application
				driver.manage().deleteAllCookies();
				// Launch the application
				driver.get("https://www.techfios.com/billing/?ng=admin/");
				// maximize the window
				driver.manage().window().maximize();
				
				//wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
	@Test
	public void positiveLogin() {
		//identify elements and insert the value
				driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
				driver.findElement(By.id("password")).sendKeys("abc123");
				driver.findElement(By.name("login")).click();
				
				
	}
	
	@Test
	public void negativeLogin() {
		driver.findElement(By.id("username")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123809897");
		driver.findElement(By.name("login")).click();
		

		
	
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}	
}
