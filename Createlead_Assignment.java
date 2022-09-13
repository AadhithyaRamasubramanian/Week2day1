package week1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		String driverpath= System.getProperty("webdriver.chrome");
		System.out.println("driverpath");
		
      ChromeDriver driver = new ChromeDriver();
      driver.get ("http://leaftaps.com/opentaps/control/login");
      WebElement username =driver.findElement(By.id("username"));
      username.sendKeys("DemoSalesManager");
      driver.findElement(By.id("password")).sendKeys("crmsfa");
      driver.findElement(By.className("decorativeSubmit")).click();
      driver.findElement(By.linkText("CRM/SFA")).click();
      driver.findElement(By.linkText("Leads")).click();
      driver.findElement(By.linkText("Create Lead")).click();
      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abc");
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aadhithya");
      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anand");
      driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aadhi");
      driver.findElement(By.className("smallSubmit")).click();
      
    
      
	}

}
