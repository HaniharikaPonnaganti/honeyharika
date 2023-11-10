package Honey.maven;
import java.time. Duration;

import org.openqa.selenium.By;
import org.openqa.selenium. WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote. CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Mavendemo{
	WebDriver driver;
	
	@BeforeTest
	public void browser()
	{

	 WebDriverManager.chromedriver().setup();
	 ChromeOptions options = new ChromeOptions(); //options.addArguments("-headless");
	 options.addArguments("--disable-notifications");
	 options.addArguments("--disable-gpu"); 
	 options.addArguments("-disable-extensions");
	 options.addArguments("-no-sandbox");
	 options.addArguments ("-disable-dev-shm-usage");
	 options.addArguments("--remote-allow-origins=*");
	 //--remote-allow-origins");
	 options.setAcceptInsecureCerts(true);
	 DesiredCapabilities capabilities = new DesiredCapabilities(); 
	 capabilities.setCapability (ChromeOptions. CAPABILITY, options);
	 capabilities.setCapability (CapabilityType.ACCEPT_INSECURE_CERTS, true); 
	 capabilities.setCapability("React App.chrome.allowAllCookies", "true");
	 options.merge(capabilities);
	 driver = new ChromeDriver (options);
	 driver.manage().window().maximize(); 
     //driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout (Duration.ofSeconds(50)); 
	 driver.manage().timeouts().implicitlyWait(Duration. ofSeconds (20));
	 System.setProperty("webdriver.http. factory", "jdk-http-client"); 
	 options.addArguments ("headless", "disable-gpu", "-ignore-certificate-errors");
	 driver.get("https://accounts.google.com/");
	 //https://www.simplilearn.com/");
	 //https://www.youtube.com/");
		
		/* WebDriverManager.edgedriver().setup();
		 EdgeOptions options = new EdgeOptions(); //options.addArguments("-headless");
		 options.addArguments("--disable-notifications");
		 options.addArguments("--disable-gpu"); 
		 options.addArguments("-disable-extensions");
		 options.addArguments("-no-sandbox");
		 options.addArguments ("-disable-dev-shm-usage");
		 options.addArguments("--remote-allow-origins");
		 options.setAcceptInsecureCerts(true);
		 DesiredCapabilities capabilities = new DesiredCapabilities(); 
		 capabilities.setCapability (EdgeOptions. CAPABILITY, options);
		 capabilities.setCapability (CapabilityType.ACCEPT_INSECURE_CERTS, true); 
		 capabilities.setCapability("React App.chrome.allowAllCookies", "true");
		 options.merge(capabilities);
		 driver = new EdgeDriver(options);
		 driver.manage().window().maximize(); 
	     driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout (Duration.ofSeconds(50)); 
		 driver.manage().timeouts().implicitlyWait(Duration. ofSeconds (20));
		 System.setProperty("webdriver.http. factory", "jdk-http-client"); 
		 options.addArguments ("headless", "disable-gpu", "-ignore-certificate-errors");
		 driver.get("https://mail.google.com");*/
	}
		@AfterMethod
		public void browsertwo ( ) {
			System.out.println("After Method");
		}
	
		@Test
		public void testdemo() throws InterruptedException {
			//demoPOM1 d=PageFactory.initElements(driver, demoPOM1.class);
			driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("haniharika586@gmail.com");
			Thread.sleep(9000);
			//d.search_operation.sendKeys("haniharika586@gmail.com");
			//Thread.sleep(5000);
			//d.Next_btn.click();
			//Thread.sleep(5000);
			//d.password.sendKeys("18HU1A0586h$");
			//Thread.sleep(5000);
			//d.Next_btn.click();
			
		}
}