package Apps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class MyWebAppTest {
  @Test
  public void verifyTitle() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://myazuredemo.azurewebsites.net/mywebProject/");
	  
	  String title = driver.getTitle();
	  
	  System.out.println("Title is "+title);

	 //Assert.asserttru(title, "My N Login Page");
	  
	  
	  Thread.sleep(2000);
	  
	  driver.close();
  }
}
