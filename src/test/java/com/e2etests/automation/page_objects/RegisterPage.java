package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.e2etests.automation.utils.ConfigFileReader1;
import com.e2etests.automation.utils.Setup; 
		public class RegisterPage {
			private ConfigFileReader1 configFileReader1;
			
			/**@FindBy***/
			
			@FindBy(xpath = "//input[@name='firstName']")
			public static WebElement firstname;
			
			@FindBy(how = How.NAME,using = "lastName")
			public static WebElement lastname;
			
			@FindBy(how = How.NAME,using = "phone")
			public static WebElement phone;
			
			@FindBy(how = How.NAME,using = "userName")
			public static WebElement email;
			
			@FindBy(how = How.NAME,using = "address1")
			public static WebElement adresse;
			
			@FindBy(how = How.NAME,using = "city")
			public static WebElement city;
			
			@FindBy(how = How.NAME,using = "city")
			public static WebElement province;
			
			@FindBy(how = How.NAME,using = "postalCode")
			public static WebElement codepostale;
			
			@FindBy(how = How.NAME,using = "country")
			public static WebElement country;
			
			@FindBy(how = How.NAME,using = "email")
			public static WebElement username;
			
			@FindBy(how = How.NAME,using = "password")
			public static WebElement Passwordtxt;
			
			@FindBy(how = How.NAME,using = "confirmPassword")
			public static WebElement confirmpasswordtxt;
			
			@FindBy(how = How.NAME,using = "submit")
			public static WebElement btnsubmit;
			
			@FindBy(how = How.XPATH,using = "//font[contains(text(),'Thank you for registering.')]")
			public static WebElement welcomeMsg;
			
			public RegisterPage() {
			PageFactory.initElements(Setup.getDriver(), this); 
			this.configFileReader1 = new ConfigFileReader1();
							}
			
			/**Create Methods **/
			public void goToUrl() {
			
				    Setup.getDriver().get(configFileReader1.getProperties("home.url"));

				    WebDriverWait wait = new WebDriverWait(
				            Setup.getDriver(),
				            Duration.ofSeconds(10));

				    wait.until(ExpectedConditions.urlContains("register"));
				
			}
			
			/**Actions**/
			public void fillName(String firstName) {
				
				WebDriverWait wait = new WebDriverWait(
				      Setup.getDriver(),Duration.ofSeconds(10));

				    wait.until(ExpectedConditions.visibilityOf(firstname));
		        firstname.sendKeys(firstName);
		    }
			public void filllastname(String lastName) {
				WebDriverWait wait = new WebDriverWait(
				        Setup.getDriver(),
				        Duration.ofSeconds(10));

				    wait.until(ExpectedConditions.visibilityOf(lastname));
		        lastname.sendKeys(lastName);
		    }

		    public void fillPhone(String phoneNumber) {
		    	WebDriverWait wait = new WebDriverWait(
		    	 Setup.getDriver(),
		    	 Duration.ofSeconds(10));
			    wait.until(ExpectedConditions.visibilityOf(phone));
		        phone.sendKeys(phoneNumber);
		    }

		    public void fillEmail(String emailTxt) {
		    	WebDriverWait wait = new WebDriverWait(
				    Setup.getDriver(),
				    Duration.ofSeconds(10));
					wait.until(ExpectedConditions.visibilityOf(email));
		        email.sendKeys(emailTxt);
		    }

		    public void fillAddresse(String addressTxt) {
		    	WebDriverWait wait = new WebDriverWait(
				    	 Setup.getDriver(),
				    	 Duration.ofSeconds(10));
					    wait.until(ExpectedConditions.visibilityOf(adresse));
		    	adresse.sendKeys(addressTxt);
		    }

		    public void fillCity(String cityTxt) {
		    	WebDriverWait wait = new WebDriverWait(
				    	 Setup.getDriver(),
				    	 Duration.ofSeconds(10));
					    wait.until(ExpectedConditions.visibilityOf(city));
		        city.sendKeys(cityTxt);
		    }

		    public void fillcodepostale(String postalCodeTxt) {
		    	WebDriverWait wait = new WebDriverWait(
				    	 Setup.getDriver(),
				    	 Duration.ofSeconds(10));
					    wait.until(ExpectedConditions.visibilityOf(codepostale));
		    	codepostale.sendKeys(postalCodeTxt);
		    }

		    public void fillCountry(String countryTxt) {
		    	WebDriverWait wait = new WebDriverWait(
				    	 Setup.getDriver(),
				    	 Duration.ofSeconds(10));
					    wait.until(ExpectedConditions.visibilityOf(country));
					    Select select = new Select(country);
					    select.selectByValue("TUNISIA");
		    }
		    
		    public void fillProvince(String provinceX) {
		    	WebDriverWait wait = new WebDriverWait(
				    	 Setup.getDriver(),
				    	 Duration.ofSeconds(10));
					    wait.until(ExpectedConditions.visibilityOf(province));
		        province.sendKeys(provinceX);
		    }

		    public void fillUsername(String usernameTxt) {
		    	WebDriverWait wait = new WebDriverWait(
				    	 Setup.getDriver(),
				    	 Duration.ofSeconds(10));
					    wait.until(ExpectedConditions.visibilityOf(username));
		        username.sendKeys(usernameTxt);
		    }

		    public void fillPasswordtxt(String passwordtxt) {
		    	WebDriverWait wait = new WebDriverWait(
				    	 Setup.getDriver(),
				    	 Duration.ofSeconds(10));
					    wait.until(ExpectedConditions.visibilityOf(Passwordtxt));
		    	Passwordtxt.sendKeys(passwordtxt);
		    }

		    public void fillconfirmpasswordtxt(String confirmPassword) {
		    	WebDriverWait wait = new WebDriverWait(
				    	 Setup.getDriver(),
				    	 Duration.ofSeconds(10));
					    wait.until(ExpectedConditions.visibilityOf(confirmpasswordtxt));
		        confirmpasswordtxt.sendKeys(confirmPassword);
		    }


		    public void clickbtnsubmit() {
		        btnsubmit.click();
		    }
		    
		    public boolean welcomeMsgIsDisplayed() {
		        return welcomeMsg.isDisplayed();
		    }

		    public String getWelcomeMessage() {
		        return welcomeMsg.getText();
		    }

		   
		}
			
		

	


