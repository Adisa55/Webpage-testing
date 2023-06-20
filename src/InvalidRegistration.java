import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class InvalidRegistration {


    public static void main(String[] args)  throws InterruptedException {
    WebDriver driver = new SafariDriver();
    driver.manage().window().maximize();
    driver.get("https://moccacommerce.com/my-account/");
    driver.findElement(By.id("wt-cli-accept-all-btn")).click();
    driver.findElement(By.id("reg_username")).sendKeys("hali00l000");
    driver.findElement(By.id("reg_email")).sendKeys("ahmedhalilovic66@gmail.com  ");
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

      /* This test actually shows us that we cannot register twice with the same email and username, 
      with the fact that there is a bug on the page and it concerns that no matter if we enter an email that does not exist, 
      the page will register us */
    
    }}