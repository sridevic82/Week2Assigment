package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Find Contacts")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sridevic82@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
        String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(5000);
		WebElement dropdown = driver.findElement(By.id("addMarketingCampaignForm_marketingCampaignId"));
        Select campaign=new Select(dropdown);
        campaign.selectByValue("9000");
        driver.findElement(By.xpath("//input[@value='Add']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("updateContactForm_departmentName")).clear();
        Thread.sleep(5000);
        driver.findElement(By.id("updateContactForm_departmentName")).sendKeys("Selenium Automation Testing");
        driver.findElement(By.xpath("//input[@value='Update']")).click();
         String marketingtext = driver.findElement(By.id("viewContact_marketingCampaigns_sp")).getText();
         if (marketingtext.equals("eCommerce Site Internal Campaign"))
        		 {
        	 System.out.println("Marketing Campaigns text is veried as : eCommerce Site Internal Campaign");
        		 }
        String titlepage = driver.getTitle();
       if (titlepage.equalsIgnoreCase("View Contact | opentaps CRM"))
       {
        System.out.println("Titlepage is veried as : View Contact | opentaps CRM");
        
        
        
	}

}
}
