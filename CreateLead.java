package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		//Setup browser driver
		WebDriverManager.chromedriver().setup();
		//Launch browser
		ChromeDriver driver = new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Deeps");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("deepika_lydia@yahoo.com");
		WebElement eleAT = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select (eleAT);
		//dd.selectByIndex(2);
		dd.selectByValue("LEAD_DIRECTMAIL");
		//select state/province;
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd2 = new Select (stateProvince);
		dd2.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The title is " + driver.getTitle());
	}

}
