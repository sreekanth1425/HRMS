package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGSelenium {
	WebDriver driver;
@BeforeMethod
public void bef() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
   // ChromeOptions ch = new ChromeOptions();
   // ch.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
   //driver.navigate().to("http://www.google.com");
    driver.navigate().to("https://www.google.com");
	
	//System.out.println("bef");
}
@Test
public void test1() throws InterruptedException {
	//String title=driver.getTitle();
	driver.navigate().to("https://www.selenium.dev/documentation/webdriver/interactions/alerts/#alerts");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='See an example alert']")).click();
	Thread.sleep(3000);
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());

	String text =alert.getText();
	if(text.equals("Sample alert")) {
		System.out.println("correct alert msg");
	}
	else {
		System.out.println("incorrect alert msg");
	}
}
@Test
public void googleTitleTest() {
	String title=driver.getTitle();
	System.out.println(title);
}
@Test
public void googleLogoTest() {
	boolean b=driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	System.out.println(b);
}
@AfterMethod
public void aft() {
	System.out.println("done");
	
}

}
