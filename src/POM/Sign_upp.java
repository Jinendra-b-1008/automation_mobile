package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_upp {

        
        WebDriver driver;
        public Sign_upp(WebDriver driver)
        {
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }
        
        public void goTo1() 
        {
        	driver.get(" https://mobileworld.banyanpro.com/");
			
		}
        
        @FindBy(xpath="//button[.='SIGN IN']")
        WebElement sign;
        
        @FindBy(xpath = "//a[normalize-space()='Sign up']")
    	WebElement signup;
    	
    	@FindBy(xpath = "//input[@id='myName']")
    	WebElement firstname;
    	
    	@FindBy(xpath = "//input[@placeholder='Last Name']")
    	WebElement lastname;
    	
    	@FindBy(xpath = "//input[@placeholder='Enter Email']")
    	WebElement emailid;
    	
    	@FindBy(xpath = "//input[@placeholder='Password']")
    	WebElement signuppassword;
    	
    	@FindBy(xpath = "//input[@type='date']")
    	WebElement calender;
    	
    	@FindBy(xpath = "//div[@class='col-md-2']//input[@name='gender']")
    	WebElement gender;
    	
    	@FindBy(xpath = "//input[@placeholder='91XXXXXXXXXX']")
    	WebElement mobileno;
    	
    	@FindBy(xpath = "//textarea[@placeholder='Short Bio']")
    	WebElement discription;
    	
    	@FindBy(xpath = "//button[@type='submit']")
    	WebElement registration;
    	
    	public WebElement s1()
        {
            return sign;
        }
    	public WebElement s2() 
    	{
			return signup;
		}
        public WebElement f()
        {
            return firstname;
        }
        public  WebElement l()
        {
            return lastname;
        }
        public WebElement e()
        {
            return emailid;
        }
        public WebElement p()
        {
            return signuppassword;
        }
        
        public WebElement cal()
        {
            return calender;
        }
        
        public WebElement gen()
        {
            return gender;
        }
        
        public WebElement mob()
        {
            return mobileno;
        }
 
        
        public WebElement disc()
        {
            return discription;
        }
        
        public WebElement reg()
        {
            return registration;
        }
		public void goTo() {
			// TODO Auto-generated method stub
			
		}
}

