import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class SearchEngine {


    public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new SafariDriver();
    driver.manage().window().maximize();
    driver.get("https://moccacommerce.com");

    WebElement searchElement = driver.findElement(By.id("woocommerce-product-search-field-0"));
    searchElement.sendKeys("bbaacc");
    //searchElement.sendKeys("Nike Patike Revolution 6 Next Nature");

    driver.findElement(By.className("icon-search")).submit();
    
    Thread.sleep(10000);
			      
				int t = driver.findElements(By.xpath("//*[@id=\"main\"]/div/div[1]/div/p")).size();
			      if (t > 0) {
			         System.out.println("pass");
			      }else {
			         System.out.println("fail");
			      }
			      driver.quit();

   
    
}
}