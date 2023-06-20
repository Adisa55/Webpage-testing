import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Registration {

	public static void main(String[] args)  throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://moccacommerce.com/my-account/");
		driver.findElement(By.id("wt-cli-accept-all-btn")).click();
		driver.findElement(By.id("reg_username")).sendKeys("halil0098760");
		driver.findElement(By.id("reg_email")).sendKeys("ahmedhalilovichghkkk66@gmail.com ");
		driver.findElement(By.id("reg_password")).sendKeys("Visoko12345*");
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/div/form/p[4]/button")).click();

		Thread.sleep(10000);
	      
		int t = driver.findElements(By.xpath("//*[@id=\"wrapper\"]/ul/li/div")).size();
	      if (t > 0) {
	         System.out.println("Fail");
	      }else {
	         System.out.println("Pass");
	      }
	      driver.quit();
		

       /*
	   In this case the test is valid, but since the account already exists, 
	   any subsequent testing will be invalid. 
	   Therefore, during each test, we have to write a new email and username 
	   */
	

}
}

