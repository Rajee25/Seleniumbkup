package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='nav-link-yourAc"
				+ "count']/span[2]")).click();
		
		driver.findElement(By.id("createAccountSubmit")).click();
		
		//System.out.println(driver.findElement(By.className("nav-line-2")).getText());
		
		driver.findElement(By.id("ap_customer_name")).sendKeys("Sadhasivam");
		driver.findElement(By.id("ap_phone_number")).sendKeys("9962449680");
		driver.findElement(By.id("ap_email")).sendKeys("sadhasivaam@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.close();
		
	}

}
