import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class MorePiecesOfItem {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://moccacommerce.com");
		driver.findElement(By.id("wt-cli-accept-all-btn")).click();


     //select item from dropdown menu
      WebElement menuTrigger = driver.findElement(By.id("menu-item-77286"));
      Actions actions = new Actions(driver);
      actions.moveToElement(menuTrigger).perform();

    
     WebElement menuItem = driver.findElement(By.id("menu-item-157122"));
     menuItem.click();
     Thread.sleep(10000);


     //press + and check if number of pieces is same 
     WebElement element = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/a/img"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	         js.executeScript("arguments[0].scrollIntoView()", element);
	         element.click();
             Thread.sleep(5000);

     WebElement chartElement = driver.findElement(By.id("quantity_63a7a97b41828"));
      // Get the current number of pieces in the cart
      String originalPieces = chartElement.getText();

     WebElement element1 = driver.findElement(By.xpath("//*[@id=\"col-2066216568\"]/div/div[2]/form/div/div[2]/div/input[3]"));
     
      element1.click();
    
      String newPiece = chartElement.getText();
      if (newPiece == originalPieces ){
        System.out.println("pass");
       }
      else {
        System.out.println("fail");
      }
      


}
}