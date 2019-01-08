package ABCpackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class UseElementLocatorTechniques {

	WebDriver driver;

	public void invokeBrowser(String url) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(url);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void elementLocatorTechniquesUsingAmazon() {
		try {
			invokeBrowser("https://www.facebook.com/");
			driver.findElement(By.linkText("Your Amazon.com")).click();
			driver.navigate().back();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Sunglass");
			driver.findElement(By.className("nav-input")).click();
			driver.navigate().back();
			driver.findElement(By.partialLinkText("Today")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void elementLocatorTechniqueUsingFacebook() {
		try {
			invokeBrowser("http://www.facebook.com");
			driver.findElement(By.name("firstname")).sendKeys("QTest");
			driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
			//closeBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeBrowser() {
		driver.close();
	}

	public static void main(String[] args) {
		UseElementLocatorTechniques obj = new UseElementLocatorTechniques();
		//obj.elementLocatorTechniquesUsingAmazon();
		obj.elementLocatorTechniqueUsingFacebook();

	}

}
