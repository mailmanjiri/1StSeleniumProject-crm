package NewConcept;

import java.util.concurrent.TimeUnit;

//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	 WebDriver driver;
	
	@Before
	public void init() {   //init- initialize, 
		// set system property
				System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
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
	public void positiveLogin() throws InterruptedException {
		//identify elements and insert the value
				driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
				driver.findElement(By.id("password")).sendKeys("abc123");
				driver.findElement(By.name("login")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/a/span[1]")).click();;
			    driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")).click();
			    driver.findElement(By.id("account")).sendKeys("Test 123");
			    driver.findElement(By.id("balance")).sendKeys("$2000");
			    driver.findElement(By.id("account_number")).sendKeys("2342342");
			    driver.findElement(By.id("contact_person")).sendKeys("xyz");
			    driver.findElement(By.id("contact_phone")).sendKeys("789-234-2342");
			    driver.findElement(By.id("ib_url")).sendKeys("abc.com");
			    driver.findElement(By.id("description")).sendKeys("saving account");
			    driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")).click();

			    

			
				
	}
	
	//@Test
	public void negativeLogin() {
		driver.findElement(By.id("username")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123809897");
		driver.findElement(By.name("login")).click();
		
		}
	
	//@After
	public void closeBrowser() {
		driver.close();
	}


}
