package basic.projectSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ZoomIn_ZoomOut {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyData\\Java_Selenium_Codes\\MyWorkspaces\\July_WS\\projectSelenium\\src\\test\\java\\resources\\chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_EQUALS);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_EQUALS);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_MINUS);
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom = '75%'");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom = '125%'");
		
		
	}

}
