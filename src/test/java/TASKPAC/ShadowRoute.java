package TASKPAC;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowRoute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement shadowele = driver.findElement(By.xpath("//div[@id='userName']"));	
		jse.executeScript("return arguments[0].shadowRoot.querySelector('a').click()", shadowele);
		
	}

}
