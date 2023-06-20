import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;


public class UpdateChart {

    public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://moccacommerce.com");
		driver.findElement(By.id("wt-cli-accept-all-btn")).click();
		Thread.sleep(5000);
		//find and select item
		
		 WebElement element = driver.findElement(By.xpath("//*[@id=\"col-1877897371\"]/div/div[2]/div[4]/div/div[2]/div[2]/div[1]/p[2]/a"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;                
	         js.executeScript("arguments[0].scrollIntoView()", element);
	         element.click();
	         Thread.sleep(5000);
            
          //add element to cart
	         JavascriptExecutor jse = (JavascriptExecutor) driver;
	 		jse.executeScript("window.scrollBy(0,1500)");
	 		 WebElement element1 = driver.findElement(By.cssSelector("#col-1973933674 > div > div.add-to-cart-container.form-minimal.is-normal > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button"));
	 	     element1.click();
	 	     Thread.sleep(10000);

	 	     //open cart
	 	    driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div[4]/ul/li[2]/div/a/span")).click();
	 	    Thread.sleep(5000);

	 	    //reduce number to 0 and update cart 
	 	   driver.findElement(By.cssSelector("#main > div.cart-container.container.page-wrapper.page-checkout > div > div.woocommerce.row.row-large.row-divided > div.col.large-7.pb-0 > form > div > table > tbody > tr.woocommerce-cart-form__cart-item.cart_item > td.product-quantity > div > input.minus.button.is-form")).click();
	 	  driver.findElement(By.cssSelector("#main > div.cart-container.container.page-wrapper.page-checkout > div > div.woocommerce.row.row-large.row-divided > div.col.large-7.pb-0 > form > div > table > tbody > tr:nth-child(2) > td > button")).click();
		Thread.sleep(7000);

		//check when cart is emoty user is informed
	 	 int t = driver.findElements(By.cssSelector("#main > div.cart-container.container.page-wrapper.page-checkout > div > div.woocommerce > div > p > a")).size();
	      if (t > 0) {
	         System.out.println("Pass");
	      }else {
	         System.out.println("Fail");
	      }
	      driver.quit();
}
}
