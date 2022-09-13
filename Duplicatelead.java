package week1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicatelead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		String driverpath= System.getProperty("webdriver");
		System.out.println("driverpath");
		// to launch the browser//
		ChromeDriver driver = new ChromeDriver();
		// to load the url//
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Jayam industries");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aadhithya");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramasubramanian");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aadhi");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computerscience");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("r.aadhithya@gmail.com");
        Thread.sleep(3000);
        WebElement drop = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select down= new Select(drop);
        down.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
        String text = driver.getTitle();
      System.out.println(text);
       driver.findElement(By.linkText("Duplicate Lead")).click();
       driver.findElement(By.id("createLeadForm_companyName")).clear();
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abc");
       driver.findElement(By.id("createLeadForm_firstName")).clear();
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("AadhithyaAnand");
       driver.findElement(By.className("smallSubmit")).click();
       String text1 =driver.getTitle();
       System.out.println(text1);
	}
	

}
