package com.e2etests.automation.page_objects;
		import static org.junit.jupiter.api.Assertions.assertEquals;
        import java.util.jar.Attributes.Name;
		import org.eclipse.jetty.util.security.Password;
        import org.openqa.selenium.WebElement; 
		import org.openqa.selenium.support.FindBy; 
		import org.openqa.selenium.support.How;
		import org.openqa.selenium.support.PageFactory;
        import com.e2etests.automation.utils.ConfigFileReader1;
		import com.e2etests.automation.utils.Setup;
        import com.ibm.icu.message2.Mf2DataModel.Text; 
		public class RegisterPage {
			private ConfigFileReader1 configFileReader1;
			
			/**@FindBy***/
			
			@FindBy(how = How.NAME,using = "firstName")
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
			public static WebElement Password;
			
			@FindBy(how = How.NAME,using = "confirmPassword")
			public static WebElement Confirmpassword;
			
			@FindBy(how = How.NAME,using = "submit")
			public static WebElement btnsubmit;
			
			@FindBy(how = How.TAG_NAME,using = "Note: Your user name is Bochra Laamiri.")
			public static WebElement welcomeMsg;
			
			public RegisterPage() {
				PageFactory.initElements(Setup.getDriver(), this); 
				this.configFileReader1 = new ConfigFileReader1();
			}
			
			/**Create Methods **/
			public void goToUrl() {
				Setup.getDriver().get(configFileReader1.getProperties("home.url"));
			}
			
			/**Actions**/
			public void fillName(String firstName) {
		        firstname.sendKeys(firstName);
		    }
			public void filllastname(String lastName) {
		        lastname.sendKeys(lastName);
		    }

		    public void fillPhone(String phoneNumber) {
		        phone.sendKeys(phoneNumber);
		    }

		    public void fillEmail(String emailTxt) {
		        email.sendKeys(emailTxt);
		    }

		    public void fillAddress(String addressTxt) {
		        address.sendKeys(addressTxt);
		    }

		    public void fillCity(String cityTxt) {
		        city.sendKeys(cityTxt);
		    }

		    public void fillState(String stateTxt) {
		        state.sendKeys(stateTxt);
		    }

		    public void fillcodepostale(String postalCodeTxt) {
		    	codepostale.sendKeys(postalCodeTxt);
		    }

		    public void fillCountry(String countryTxt) {
		        country.sendKeys(countryTxt);
		    }
		    
		    public void fillprovince(String province) {
		        province.sendKeys(province);
		    }

		    public void fillUsername(String usernameTxt) {
		        username.sendKeys(usernameTxt);
		    }

		    public void fillpassword(String password) {
		        password.sendKeys(password);
		    }

		    public void fillConfirmPassword(String confirmPasswordTxt) {
		        confirmPassword.sendKeys(confirmPasswordTxt);
		    }


		    public void clickbtnsubmit() {
		        btnsubmit.click();
		    }

		    public String getMessagetxt() {
		        return welcomeMsg.getText();
		        
		        assertEquals(welcomeMsg, Text);
		    }
		}
			
		

	


