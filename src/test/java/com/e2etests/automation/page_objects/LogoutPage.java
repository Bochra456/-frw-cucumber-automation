package com.e2etests.automation.page_objects;

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import com.e2etests.automation.utils.Setup;

	public class LogoutPage {

	    /** @FindBy **/

	    @FindBy(how = How.ID, using = "react-burger-menu-btn")
	    public static WebElement burgerMenuBtn;

	    @FindBy(how = How.ID, using = "logout_sidebar_link")
	    public static WebElement logoutLink;

	    @FindBy(how = How.ID, using = "about_sidebar_link")
	    public static WebElement aboutLink;

	    @FindBy(how = How.CLASS_NAME, using = "login_logo")
	    public static WebElement loginPageLogo;

	    public LogoutPage() {
	        PageFactory.initElements(Setup.getDriver(), this);
	    }

	    /** Create Methods **/

	    public void clicBurgerMenu() {
	        WebDriver driver = Setup.getDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(burgerMenuBtn)).click();
	    }

	    public void clicLogout() {
	        WebDriver driver = Setup.getDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
	    }

	    public void clicAbout() {
	        WebDriver driver = Setup.getDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(aboutLink)).click();
	    }

	    public String getLoginPageLogoText() {
	        WebDriver driver = Setup.getDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        return wait.until(ExpectedConditions.visibilityOf(loginPageLogo)).getText();
	    }

	    public String getCurrentUrl() {
	        return Setup.getDriver().getCurrentUrl();
	    }
	}
