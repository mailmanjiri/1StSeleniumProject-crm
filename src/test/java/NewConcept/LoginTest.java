package NewConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		init();
		positiveLogin();
		closeBrowser();
		
//		init();
//		negativeLogin();
//		closeBrowser();

		
	}
	
	public static void init() {   //init- initialize, 
		// set system property
				System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
				System.out.println("Hello");
				driver= new ChromeDriver();
				// delete cookies has to happen before going to application
				System.out.println("Before cookies");
				driver.manage().deleteAllCookies();
				System.out.println("after cookies");
				// Launch the application
				driver.get("https://www.techfios.com/billing/?ng=admin/");
				// maximize the window
				driver.manage().window().maximize();
				
				//wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
	public static void positiveLogin() {
		//identify elements and insert the value
		
		
				driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
				driver.findElement(By.id("password")).sendKeys("abc123");
				driver.findElement(By.name("login")).click();
				
				
	}
	
	public static void negativeLogin() {
		driver.findElement(By.id("username")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123809897");
		driver.findElement(By.name("login")).click();
		

		
	
	}
	
	public static void closeBrowser() {
		driver.close();
	}

}
