package TASKPAC;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.in/");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ASUS",Keys.ENTER);
      driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
      driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
      driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
      String parent = driver.getWindowHandle();
      System.out.println(parent);
      Set<String> childs = driver.getWindowHandles();
      System.out.println(childs);
      for (String x:childs) {
    	  if(!x.equals(parent)) {
    		  driver.switchTo().window(x);
    	  }
    	 
      }
      
	}

}
