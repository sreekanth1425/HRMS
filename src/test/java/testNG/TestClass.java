package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
	WebDriver driver;
	@BeforeMethod
	public void testi() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		System.out.println("testi");
	}
	@Test
	public void sample() throws InterruptedException {
		driver.get("https://www.google.com");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()='See an example alert']")).click();
		//Thread.sleep(3000);
		//Alert alert=driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.accept();
		System.out.println("test");
		
	}
	@AfterMethod
	public void after() {
		System.out.println("after test");
		
	}
}
	
