package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.Sign_inp;

public class Signin_Srcipt {
    
    
    
        
        @Test(dataProvider="login")//LOGIN
        public void sign(String username,String Password) throws Exception
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\jinendra.y\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            
            Sign_inp sp=new Sign_inp(driver);
            sp.goTo();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            sp.s().click();
            Thread.sleep(2000);
            sp.u().sendKeys(username);
            Thread.sleep(2000);
            sp.p().sendKeys(Password);
            Thread.sleep(2000);
            sp.l().click();
            driver.close();
        }
        
        @DataProvider(name="login")
        public Object[][] getdata()
        {
            Object [][] data=new Object[4][2];
          data [0][0]="Jinendra B Y";
          data [0][1]="Jinendra@1008";
          data [1][0]="Jinu";
          data [1][1]="93434";
          data [2][0]="Jinendraquali@1234 $";
          data[2][1]="Quali123";
          data[3][0]="@123J";
          data[3][1]="A";
          
          return data;
            
        }
        



   }
