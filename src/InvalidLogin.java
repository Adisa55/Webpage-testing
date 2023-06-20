import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class InvalidLogin {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
            driver.get("https://moccacommerce.com/my-account/");
            driver.findElement(By.id("wt-cli-accept-all-btn")).click();
            driver.findElement(By.id("username")).sendKeys("AdisaM");
            driver.findElement(By.id("password")).sendKeys("Stesting12345*");
            driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/div/form/p[3]/button")).click();
            
            Thread.sleep(10000);
              
            int t = driver.findElements(By.xpath("//*[@id=\"wrapper\"]/ul/li/div")).size();
              if (t > 0) {
                 System.out.println("Fail");
              }else {
                 System.out.println("Pass");
              }
              driver.quit();
        
}
}