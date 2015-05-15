package smart;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class BaseClass {
	public static WebDriver driver;
	public static Properties ObjectRepository = null;
	public static Properties CONFIG = null;
	public static boolean isLogged = false;
	static boolean Presense;
	public String actual;
	public ATUTestRecorder recorder; 
	public void initialize() throws IOException {

		/***
		 * Loading CONFIG property File
		 */
		//if (driver == null) {
			CONFIG = new Properties();
			FileInputStream fn = new FileInputStream(
					System.getProperty("user.dir")
							+ "/src/main/resources/utils/CONFIG.properties");
			CONFIG.load(fn);

			/**
			 * Loading OR Property File
			 */

			ObjectRepository = new Properties();
			fn = new FileInputStream(System.getProperty("user.dir")
					+ "/src/main/resources/utils/ObjectRepository.properties");
			ObjectRepository.load(fn);

			/**
			 * Initialising WebDriver
			 */

			if (CONFIG.getProperty("browser").equals("FireFox")) {
				driver = new FirefoxDriver();
				
			} else if (CONFIG.getProperty("browser").equals("Chrome")){
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")
						+ "/src/main/resources/utils/chromedriver.exe");
			driver = new ChromeDriver();
			}
		}
	//}

	public void lanchBrowser() throws ATUTestRecorderException, InterruptedException  
	{
	    recorder = new ATUTestRecorder(System.getProperty("user.dir") + "/src/test/java/testsRecordings","TestCaseVideo",true);
		recorder.start();
		driver.get(CONFIG.getProperty("testSiteURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
			
	}

	public void closeBrowser() throws ATUTestRecorderException 
			
	{
		
		driver.quit();
		recorder.stop();
	

	}
	
	public static void captureScreen() throws IOException{
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils
				.copyFile(
						scrFile,
						new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/Exception.png"));
	}
	
	public static WebElement getObject(String XpathElement, String IDElement) throws IOException {
		String Xpath=XpathElement;
		String ID=IDElement;
		try {

			if (Xpath!=null) {
				WebElement myDynamicElement = (new WebDriverWait(driver, 80))
						.until(ExpectedConditions.presenceOfElementLocated(By
								.xpath(Xpath)));
				Presense = myDynamicElement.isDisplayed();
				return driver.findElement(By.xpath(Xpath));
			}

			else if (ID!=null) {
				WebElement myDynamicElement1 = (new WebDriverWait(driver, 80))
						.until(ExpectedConditions.presenceOfElementLocated(By
								.id(ID)));
				Presense = myDynamicElement1.isDisplayed();
				return driver.findElement(By.id(ID));
			}
		} catch (Throwable t) {
			captureScreen();
			 t.printStackTrace();
			
		}
		return null;

	}



}
