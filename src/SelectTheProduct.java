import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;


public class SelectTheProduct {


    public static void main(String[] args) throws InterruptedException{
    WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://moccacommerce.com");
		driver.findElement(By.id("wt-cli-accept-all-btn")).click();

		//select item from dropdown menu
		   WebElement menuTrigger = driver.findElement(By.id("menu-item-77286"));
	       Actions actions = new Actions(driver);
	       actions.moveToElement(menuTrigger).perform();

		   //select category from dropdown menu
	       WebElement menuItem = driver.findElement(By.id("menu-item-157122"));
	        menuItem.click();
	        Thread.sleep(10000);

			//select item from category
	      WebElement element = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/a/img"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	         js.executeScript("arguments[0].scrollIntoView()", element);
	         element.click();
	         
	         
	         //check if item is selected
             String actualUrl="https://moccacommerce.com/shop/odjeca/majice/lifestyle-majice/tom-tailor-majica-basic-long-sleeved-2/"; 
             String expectedUrl= driver.getCurrentUrl(); 
             if(actualUrl.equalsIgnoreCase(expectedUrl)){
            	  System.out.println("Test passed"); }
             
	         else { 
		     System.out.println("Test failed"); }
    
}
}
