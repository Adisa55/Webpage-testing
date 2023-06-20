import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;



public class ForgotPassword {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://moccacommerce.com");
		driver.findElement(By.id("wt-cli-accept-all-btn")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-8212\"]/a")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/div/form/p[4]/a")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("halil0009");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/form/p[3]/button")).click();
		Thread.sleep(6000);
		//to check if user is informed that he can not change pass with invalid information
		int t = driver.findElements(By.xpath("//*[@id=\"wrapper\"]/ul/li/div")).size();
	      if (t > 0) {
	         System.out.println("Pass");
	      }else {
	         System.out.println("Fail");
	      }
	      driver.quit();
    
}
}
