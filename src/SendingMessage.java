import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SendingMessage {
    
    public static void main(String[] args) throws InterruptedException {
       
        WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://moccacommerce.com");
		driver.findElement(By.id("wt-cli-accept-all-btn")).click();
		
        driver.findElement(By.linkText("Kontakt")).click();
        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
       
		//enter information to send message 
		driver.findElement(By.id("ninja_forms_field_1")).sendKeys("Adisa Dvjsbgh");
		driver.findElement(By.id("ninja_forms_field_9")).sendKeys("062756481");
        driver.findElement(By.id("ninja_forms_field_2")).sendKeys("jdfndjsfdd");
        driver.findElement(By.id("ninja_forms_field_3")).sendKeys("Postovanje, mozete li me obavijestiti kad stize nova kolekcija? Unaprijed hvala");
        driver.findElement(By.id("ninja_forms_field_2")).submit();
       

       
		/* For this test, page has bug because it doesn't give any feedback about invalid mail or even if we enter valid mail there is no message to inform user that he send message successfuly */


    }
}
