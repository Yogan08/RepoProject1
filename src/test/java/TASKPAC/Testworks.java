package TASKPAC;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testworks {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		WebElement txt1 = driver.findElement(By.xpath("//input[@onclick='show_prompt()']"));
		txt1.click();
//		Actions act = new Actions(driver);
//		act.moveToElement(txt1).perform();
//		Robot rbt = new Robot();
//		rbt.keyPress(KeyEvent.VK_TAB);
//		rbt.keyRelease(KeyEvent.VK_TAB);
//		rbt.keyPress(KeyEvent.VK_TAB);
//		rbt.keyRelease(KeyEvent.VK_TAB);
//		rbt.keyPress(KeyEvent.VK_TAB);
//		rbt.keyRelease(KeyEvent.VK_TAB);
//		rbt.keyPress(KeyEvent.VK_TAB);
//		rbt.keyRelease(KeyEvent.VK_TAB);
//		rbt.keyPress(KeyEvent.VK_ENTER);
//		rbt.keyRelease(KeyEvent.VK_ENTER);
//		Alert al = driver.switchTo().alert();
//		al.sendKeys("YG");
//		Thread.sleep(1000);
//		al.accept();
//		Select dropdown = new Select(txt1);
//		dropdown.selectByIndex(0);
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].setAttribute('value','yogan')", args);
//		js.executeScript("arguments[0].scrollIntoView(false)",args);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("");
		FileUtils.copyFile(src, des);
		
	}

}
