import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;


public class Zipcode {

    public static void main(String[] args) throws InterruptedException {


      WebDriver driver = new SafariDriver();
      driver.manage().window().maximize();
      driver.get("https://moccacommerce.com");
      driver.findElement(By.id("wt-cli-accept-all-btn")).click();
  
          //open cart
          driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div[4]/ul/li[2]/div/a/span")).click();
          Thread.sleep(5000);
  
          // cart is empty, click on go back to shop
          driver.findElement(By.cssSelector("#main > div.cart-container.container.page-wrapper.page-checkout > div > div > p.return-to-shop > a")).click();
          Thread.sleep(5000);
  
          //choose item
          driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[3]/div[4]/div/div[2]/div[1]/div[1]/a/img")).click();
          Thread.sleep(5000);
  
          //add to cart 
          driver.findElement(By.cssSelector("#col-422522726 > div > div.add-to-cart-container.form-minimal.is-normal > form > button")).click();
          Thread.sleep(7000); 
  
  
          WebElement payment = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div[4]/ul/li[2]/div/a/span"));
           Actions action = new Actions(driver);
           action.moveToElement(payment).perform();

          WebElement payments =  driver.findElement(By.cssSelector("#masthead > div.header-inner.flex-row.container.logo-center.medium-logo-center > div:nth-child(4) > ul > li.cart-item.has-icon.has-dropdown > ul > li > div > p.woocommerce-mini-cart__buttons.buttons > a.button.checkout.wc-forward.wp-element-button"));
           payments.click();
           Thread.sleep(10000);

           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        
           	//enter information 
		       driver.findElement(By.id("billing_first_name")).sendKeys("Asja");
		       driver.findElement(By.id("billing_last_name")).sendKeys("Msuhdsgd");
           driver.findElement(By.id("billing_address_1")).sendKeys("bb");
           driver.findElement(By.id("billing_postcode")).sendKeys("756532");
           driver.findElement(By.id("billing_city")).sendKeys("Konjic");
           driver.findElement(By.id("billing_phone")).sendKeys("0613828574");
           driver.findElement(By.id("billing_email")).sendKeys("asjahghkkk66@gmail.com");

           Thread.sleep(10000);

           driver.findElement(By.id("terms")).click();
           driver.findElement(By.id("place_order")).submit();
           Thread.sleep(7000); 

      //check if item is added to cart, user is informed
      int t = driver.findElements(By.xpath("//*[@id=\"main\"]/div[2]/div/form[2]/div[1]/ul/li/div")).size();
      if (t > 0) {
         System.out.println("Pass");
      }else {
         System.out.println("Fail");
      }
      driver.quit();
  

         
	         
}
}