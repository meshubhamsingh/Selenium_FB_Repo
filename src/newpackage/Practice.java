
package newpackage;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import zmq.ZError.IOException;


public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeOP = new ChromeOptions();
		chromeOP.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOP);
		
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\Documents\\Chromedriver\\chromedriver_win32 (5)\\chromedriver.exe");
	

	driver.get("https://www.functionize.com/h/test-automation?utm_source=google&utm_medium=paid%20search&utm_campaign=automated%20web%20testing&utm_term=web%20automation%20tools&utm_campaign=Z+-+India+-+Automation+Testing+Tools&utm_source=adwords&utm_medium=ppc&hsa_acc=5488573823&hsa_cam=16229123507&hsa_grp=132134212285&hsa_ad=583785827401&hsa_src=g&hsa_tgt=kwd-317146951385&hsa_kw=web%20automation%20tools&hsa_mt=p&hsa_net=adwords&hsa_ver=3&gad=1&gclid=CjwKCAjw4P6oBhBsEiwAKYVkqwBgOJkJ4r8YM_xMvCIqH9L5AOdyuEP-E9E0WjcmQXiYH2lzL_DTGhoCclkQAvD_BwE");
driver.manage().window().maximize();
driver.findElement(By.name("firstname")).sendKeys("Shubham");
driver.findElement(By.name("lastname")).sendKeys("Singh");
driver.findElement(By.name("email")).sendKeys("singh020597@gmail.com");
driver.findElement(By.name("phone")).sendKeys("9082982238");
driver.findElement(By.name("company")).sendKeys("Nesle");

Select s = new Select(driver.findElement(By.id("job_role-e65821c3-a1ec-4b15-9767-25c917c9afc1")));  
s.selectByVisibleText("QA Analyst");
Select t = new Select(driver.findElement(By.id("total_size_of_test_suite-e65821c3-a1ec-4b15-9767-25c917c9afc1")));  
t.selectByIndex(1);
driver.findElement(By.xpath("//*[@id=\"do_you_have_any_hands_on_experience_with_selenium_or_other_scripted_automation_1-e65821c3-a1ec-4b15-9767-25c917c9afc1\"]")).click();
//driver.findElement(By.id("terms_and_conditions")).click();
System.out.println(driver.findElement(By.id("terms_and_conditions-e65821c3-a1ec-4b15-9767-25c917c9afc1")).isSelected()); 
Thread.sleep(100);
//WebElement st=driver.findElement(By.tagName("//*[@id=\"terms_and_conditions-e65821c3-a1ec-4b15-9767-25c917c9afc1\"]"));
//driver.switchTo().frame("st");
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
driver.findElement(By.cssSelector("[id=\"terms_and_conditions-e65821c3-a1ec-4b15-9767-25c917c9afc1\"]")).click();

	
	
	}

}
