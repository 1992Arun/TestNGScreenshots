package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClas {

	public static WebDriver driver;



	public static void browserLaunch(String browser) {

		

		switch(browser){

		case "Chrome": driver = new ChromeDriver();

		break;

		case "Edge": driver = new EdgeDriver();

		break;

		case "Firefox": driver = new FirefoxDriver();

		break;



		}

	}


	public static String getURL(String url) {


		driver.get(url);

		driver.manage().window().maximize();

		return url;



	}


	public static void implicitWait(int sec) {


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));



	}


	public static void click(WebElement e){

		e.click();


	}

	public static void jClick(WebElement e){


		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].click();", e);
		

	}
	
	
	


	public static void sendKeys(WebElement e, String value){


         e.sendKeys(value);

		


	}


	public static void jSendKeys(WebElement e, String value){


		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].value='"+ value +"';", e);

		

	}

	public static void frameid(int index) {

		driver.switchTo().frame(index);


	}

	public static void frameName(String name) {

		driver.switchTo().frame(name);


	}


	public static void frameWeb(WebElement e) {

		driver.switchTo().frame(e);


	}

	public static void windowName(String name){

		Set<String> windowHandles = driver.getWindowHandles();

		String windowHandle = driver.getWindowHandle();

		for(String window: windowHandles) {

			if(!window.equalsIgnoreCase(name)) {

				driver.switchTo().window(window);

			}


		}

	}

	public static void windowNo(int num){

		Set<String> windowHandles = driver.getWindowHandles();

		int count =1;

		for(String window: windowHandles) {

			if(count ==num) {

				driver.switchTo().window(window);

			}

			count++;

		}


	}



	public static void selectByIndex(WebElement e, int index ){


		Select s = new Select(e);

		s.selectByIndex(index);


	}


	public static void selectByValue(WebElement e, String value ){


		Select s = new Select(e);

		s.selectByValue(value);


	}


	public static void selectByText(WebElement e, String text ){


		Select s = new Select(e);

		s.selectByVisibleText(text);


	}


	public static void doublClick(WebElement e){

		Actions a = new Actions(driver);

		a.doubleClick().perform();

	}


	public static String getText(WebElement e) {

		String text = e.getText();

		return text;
	}


	public static String getAttribute(WebElement e, String name) {

		String text = e.getAttribute(name);

		return text;
       
	}

	
	public static void dragAndDrop(WebElement e, WebElement b){
		
		
		Actions a = new Actions(driver);
		
		
        a.dragAndDrop(e, b).perform();
		
		
	}
	
	public static String time(){
		
		
		
		return new SimpleDateFormat("hh-mm-ss").format(new Date());
		
		
	}
	
	public static void takeScreenShots(String name) throws IOException{
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotAs, new File(System.getProperty("user.dir")+"\\Screenshots\\"+name+".png"));
		
	}


	public static String getcurrentURL(){
		
		String currentUrl = driver.getCurrentUrl();
		
		return currentUrl;
		
		
	}

	
	
	public static void enter() throws AWTException{
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	
	public static void sleep(int time) throws InterruptedException{
		
		Thread.sleep(time*1000);
		
	}
	
	public static void quit(){
		
		driver.quit();
		
		
	}
	

}










