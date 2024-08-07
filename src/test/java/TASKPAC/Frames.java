package TASKPAC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_target");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		List<WebElement> mulframes=driver.findElements(By.tagName("iframe"));
		for(int i=0;i<mulframes.size();i++) {
			try {
			driver.switchTo().frame(i);
			WebElement frame = driver.findElement(By.xpath("//iframe[@src=\'demo_iframe.htm\']"));
			}
			catch(Exception e) {
				System.out.println("Frame not available:---"+i);
				driver.switchTo().parentFrame();
			}
		}
	}

}
