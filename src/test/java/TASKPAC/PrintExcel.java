package TASKPAC;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintExcel   {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    WebDriver exceldriver = new ChromeDriver();
    exceldriver.get("https://www.amazon.in/");
    exceldriver.manage().window().maximize();
    exceldriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ASUS TUF",Keys.ENTER);		
    List<WebElement> Productname =exceldriver.findElements(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])"));  
   Thread.sleep(2000);
   List<WebElement> Pricelist =  exceldriver.findElements(By.xpath("(//span[@class='a-price-whole'])"));
   for(int i=0;i<Pricelist.size();i++) {
	   WebElement pr1= Pricelist.get(i);
        System.out.println(pr1.getText());
   }
   Thread.sleep(2000);
    File pp = new File("C:\\Users\\yogan\\eclipse-workspace\\MavenProjects\\target\\ProductPrice.xlsx");
    FileOutputStream fos = new FileOutputStream(pp);
    XSSFWorkbook wb = new XSSFWorkbook();
    XSSFSheet sheet1 = wb.createSheet("Task13");
  for(int i=0;i<Productname.size();i++) {
	  XSSFRow row = sheet1.createRow(i);
	  XSSFCell cell = row.createCell(0);
	  WebElement value =Productname.get(i);
	  System.out.println(value.getText());
	  cell.setCellValue(value.getText());
	  for(int j=i;j<=i;j++) {
		  XSSFCell cell1 = row.createCell(1);
		  WebElement priceval =Pricelist.get(i);
		  System.out.println(priceval.getText());
		  cell1.setCellValue(priceval.getText());
	  }
	  
   }
  Thread.sleep(2000);
  
  wb.write(fos);
    
    
	}

}
