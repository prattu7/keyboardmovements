package basic.projectSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyData\\Java_Selenium_Codes\\MyWorkspaces\\July_WS\\projectSelenium\\src\\test\\java\\resources\\chromedriver_107.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://online.actitime.com/cisco2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement linktxt =driver.findElement(By.linkText("actiTIME Inc."));
		Actions action= new Actions(driver);
//		Right Click on the Link Contact Us
//		action.contextClick(linktxt).build().perform();
		/*action.moveToElement(linktxt).contextClick(linktxt).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> itr= windows.iterator();
		String fWin= itr.next();
		String sWin= itr.next();
		driver.switchTo().window(sWin);
		driver.findElement(By.linkText("Try Free")).click();*/
		
		/*action.contextClick(linktxt).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).build().perform();*/
		
		action.contextClick(linktxt).build().perform();
		Robot robot = new Robot(); 
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		action.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).build().perform();
		

	}

}
