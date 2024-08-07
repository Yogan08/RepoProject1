package TASKPAC;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMIg_ml3LeahwMVl6NmAh08lQC1EAAYASAAEgLHZvD_BwE&gclsrc=aw.ds");	
		driver.findElement(By.xpath("(//div[@class=\"textWrap\"]//following::p[@class=\"main-2\"])[1]")).click();
		//driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		//driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\WORK\\AutiIt\\autoit1.exe");
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//a[@class=\'uploader__btn tooltip--left active\']")).sendKeys("D:\\WORK\\AutiIt\\autoit1.exe");

	}

}
