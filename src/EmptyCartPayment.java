import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class EmptyCartPayment {
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
        Thread.sleep(7000);

        //choose item
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[3]/div[2]/div/div[2]/div[1]/div[1]/a/img[1]")).click();
        Thread.sleep(3000);

        //add to cart 
        driver.findElement(By.cssSelector("#col-323267149 > div > div.add-to-cart-container.form-minimal.is-normal > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")).click();
        Thread.sleep(7000);       
    //check if item is added to cart, user is informed
      int t = driver.findElements(By.xpath("//*[@id=\"wrapper\"]/div/div")).size();
	      if (t > 0) {
	         System.out.println("Pass");
	      }else {
	         System.out.println("Fail");
	      }
	      driver.quit();

    
    }
}
