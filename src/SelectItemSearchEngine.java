import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;



public class SelectItemSearchEngine {

    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new SafariDriver();
	    driver.manage().window().maximize();
	    driver.get("https://moccacommerce.com");
	    driver.findElement(By.id("wt-cli-accept-all-btn")).click();
	    WebElement searchElement = driver.findElement(By.id("woocommerce-product-search-field-0"));

	    //enter what to search 
	    searchElement.sendKeys("Nike Patike Revolution 6 Next Nature");
        //click on element that we want 
	    driver.findElement(By.className("icon-search")).submit();
	    Thread.sleep(15000);
	    WebElement element = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/div[5]/div/div[2]/div[1]/div[1]/a/img[1]"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", element);
        element.click();
        Thread.sleep(3000);
        //check if information item page is opend 
        String actualUrl="https://moccacommerce.com/shop/obuca/patike/patike-za-trcanje/nike-patike-revolution-6/"; 
        String expectedUrl= driver.getCurrentUrl(); 
        if(actualUrl.equalsIgnoreCase(expectedUrl)){
       	  System.out.println("Test passed"); 
       	  }
      else { 
	   System.out.println("Test failed");
      }
	 driver.quit();
}
}
