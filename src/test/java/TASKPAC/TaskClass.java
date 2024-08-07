package TASKPAC;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the demoqa website
		driver.get("https://account.asus.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement user = driver.findElement(By.id("txtMail"));	
		WebElement clickbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement scrolldown= driver.findElement(By.xpath("(//a[@target=\"_self\"])[2]"));
		
		js.executeScript("arguments[0].setAttribute('value','9976424623')", user,clickbtn);
		js.executeScript("arguments[0].setAttribute('style','background:yellow;padding:2px;')", user,clickbtn);
		Object scriptval = js.executeScript("return arguments[0].getAttribute('value')",user);
		System.out.println("scriptval:"+  scriptval);
		js.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)",user);
		Thread.sleep(2000);
		js.executeScript("arguments[1].click()",user,clickbtn);
		

	}

}
