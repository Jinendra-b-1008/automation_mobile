package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.Sign_upp;



public class Signup_Script {

	
	@Test(dataProvider="signup")
	  public void sign(String firstname, String lastname, String email, String password,String calender,String mobileno,String disc) throws Exception {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\jinendra.y\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  Sign_upp sp=new Sign_upp(driver);
          sp.goTo1();
          
          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
          sp.s1().click();
          Thread.sleep(1000);
          
          sp.s2().click();
          Thread.sleep(1000);
          sp.f().sendKeys(firstname);
          Thread.sleep(1000);
          sp.l().sendKeys(lastname);
          Thread.sleep(1000);
          sp.e().sendKeys(email);
          Thread.sleep(1000);
          sp.p().sendKeys(password);
          Thread.sleep(1000);
          sp.cal().sendKeys(calender);
          Thread.sleep(1000);
          sp.gen().click();
          Thread.sleep(1000);
          sp.mob().sendKeys(mobileno);
          Thread.sleep(1000);
  
          sp.disc().sendKeys(disc);
          Thread.sleep(1000);
          sp.reg().click();
          driver.close();
	}    
          @DataProvider(name="signup")
          public Object[][] getdata()
          {
              Object [][] data=new Object[1][7];
            data [0][0]="Jinendra";
            data [0][1]="B";
            data [0][2]="jin@gmail.com";
            data [0][3]="J@123";
            data [0][4]="02/02/2022";
            data [0][5]="948885589";
            data [0][6]="Good things ";
           
            return data;
              
          }
		
	
}
