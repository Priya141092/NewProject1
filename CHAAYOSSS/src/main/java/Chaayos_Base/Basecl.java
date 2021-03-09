package Chaayos_Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Chaayos_util.WebEventListener;



public class Basecl {


	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	public Basecl()
	{
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/priya.saxena/eclipse-workspace/CHAYOS_REV/src/main/java/config/config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			
			
			System.setProperty("webdriver.chrome.driver", "C:/Users/priya.saxena/Desktop/priya data/Chrome/newc3/chromedriver.exe");
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--enable-javascript");
			driver= new ChromeDriver();
			//System.setProperty("webdriver.chrome.driver", "C:/Users/priya.saxena/Desktop/priya data/Chrome/newc/chromedriver.exe");
		
		}
			
		if(browsername.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "");
			driver= new FirefoxDriver();
		}
		
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver=e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		//driver.get(prop.getProperty("url2"));
	}

}





