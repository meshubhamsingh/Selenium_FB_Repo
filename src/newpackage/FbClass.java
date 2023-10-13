package newpackage;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import zmq.ZError.IOException;

public class FbClass{
	
	WebDriver driver;
	
	@Test

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		ChromeOptions chromeOP = new ChromeOptions();
		chromeOP.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOP);
		File src=new File("C:\\Users\\ssingh\\Documents\\Seleniumtest.xlsx");
		FileInputStream fil=new FileInputStream(src);
		XSSFWorkbook xsf=new XSSFWorkbook(fil);
		XSSFSheet sheet=xsf.getSheetAt(0);
		String entry=sheet.getRow(0).getCell(0).getStringCellValue();
		
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\Documents\\Chromedriver\\chromedriver_win32 (5)\\chromedriver.exe");
//	
//	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(entry);
	driver.findElement(By.id("nav-search-submit-button")).click();
	/*Here we are scrolling page using below codes*/
	WebElement w1=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", w1);
	//js.executeScript("window.scrollBy(0,500);"); 
	Thread.sleep(3000);
	
	/*driver.navigate().back();
	/*Here we are selecting options from the dropdown
	WebElement dropdown=driver.findElement(By.xpath("/*[@id=\"nav-link-accountList\']/span/span"));
	Select ddl=new Select(dropdown);
	ddl.selectByIndex(6);
	xsf.close();*/
	
	
	/*driver.findElement(By.id("email")).sendKeys("");
	driver.findElement(By.id("pass")).sendKeys("");
	driver.findElement(By.name("login")).click();*/
	
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	Thread.sleep(3000);
	
	WebElement w2=driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
	JavascriptExecutor jb=(JavascriptExecutor) driver;
	jb.executeScript("arguments[0].scrollIntoView();", w2);
	//js.executeScript("window.scrollBy(0,500);"); 
	Thread.sleep(3000);
	
	driver.findElement(By.id("add-to-cart-button")).submit();
	}

}
