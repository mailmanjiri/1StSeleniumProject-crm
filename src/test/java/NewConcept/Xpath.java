package NewConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
  
	
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
			

				    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
				    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
				    driver.findElement(By.xpath("//button[@name='login']")).click();
				    Thread.sleep(3000);
				    //click on bank and cash option
				    driver.findElement(By.xpath("//span[text()='Bank & Cash']")).click();
				    //click on new account page
				    driver.findElement(By.xpath("//a[contains(text(), 'New Account')]")).click();
				    driver.findElement(By.xpath("//input[@id='account']")).sendKeys("Saving account");
				    driver.findElement(By.xpath("//input[@id='description']")).sendKeys("New account");
				    driver.findElement(By.xpath("//input[@id='balance' and @name='balance']")).sendKeys("3000");
				    driver.findElement(By.xpath("//input[@id='contact_person']")).sendKeys("abcd");
				    driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("682-234-2425");
				    driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("45654745");
				    driver.findElement(By.xpath("//input[@id='ib_url']")).sendKeys("www.abc.com");
				    driver.findElement(By.xpath("//div[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button")).click();;
				   
				   
				  

				
					
		}
		
	
   }
