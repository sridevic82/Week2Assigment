package week2.day2;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"table_id\"]//tr"));
	
	
		
	
		
		System.out.println("The Row No is" + rows.size());
		int [] num=new int[rows.size()-1];
		
		for (int i = 2; i <= rows.size(); i++) {
			
		
			 String progresstext = driver.findElement(By.xpath("//table[@id=\"table_id\"]//tr["+i+"]/td[2]")).getText();
			 String progressstring = progresstext.replaceAll("\\D", "");
			 System.out.println(progressstring);
			 int parseInt = Integer.parseInt(progressstring);
			 
			num[i-2]=parseInt;
		}
			Arrays.sort(num);
			driver.findElement(By.xpath("//td[contains(text(),'"+num[0]+"')]/following-sibling::td/input")).click();
		
		
		
		
	}

}
