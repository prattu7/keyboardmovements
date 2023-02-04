package basic.projectSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyData\\Java_Selenium_Codes\\MyWorkspaces\\July_WS\\projectSelenium\\src\\test\\java\\resources\\chromedriver_107.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String fWind= itr.next();
		String sWind= itr.next();
		
		driver.switchTo().window(sWind);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[span[text()='Hotels']]")).click();
		
		windows = driver.getWindowHandles();
		itr = windows.iterator();
		fWind= itr.next();
		sWind= itr.next();
		String tWind= itr.next();
		
		driver.switchTo().window(tWind);
		driver.findElement(By.xpath("//input[@placeholder='Enter City or Hotel Name']")).sendKeys("Hello");
		Thread.sleep(3000);
//		driver.close();
		
		driver.switchTo().window(sWind);
		driver.findElement(By.id("stationFrom")).sendKeys("Mumbai (BOM)");
		Thread.sleep(3000);
//		driver.close();
		
		driver.switchTo().window(fWind);
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("Chennai");
		Thread.sleep(3000);
//		driver.close();
		
		driver.quit();
		
	}
}
