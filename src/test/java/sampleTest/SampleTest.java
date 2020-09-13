package sampleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void loginTest() throws IOException
	{

			System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\chromedriver.exe");
			WebDriver wd = new ChromeDriver();
			wd.manage().window().maximize();
			
			wd.get("https://www.bing.com");
			WebElement input = wd.findElement(By.name("q"));
			input.sendKeys("Chennai");
			input.submit();
			System.out.println(wd.getTitle());
			
		
			
			// Takes screenshot of the full page
			
			File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\gaayah\\Desktop\\SeleniumWorkspace\\ztryHere\\Black\\abc.png"));
	wd.quit();
	int i = 1/0;
	}


}
