package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterStepDefinition {
	private RegisterPage registerPage ;
	
	public RegisterStepDefinition() {
	this.registerPage = new RegisterPage();
	}

	    @Given("l utilisateur est sur la page d inscription")
	    public void utilisateurEstSurLaPageDInscription() {
	        registerPage.goToUrl();
	       
	        System.out.println("open browser");
	        
	    }

	    @When("il saisit un firstname valide {string}")
	    public void ilSaisitUnFirstnameValide(String firstname) {
	        registerPage.fillName(firstname);
	        System.out.println("Firstname s'écrit");
	    }

	    @And("il saisit un lastname valide {string}")
	    public void ilSaisitUnLastnameValide(String lastname) {
	        registerPage.filllastname(lastname);
	        System.out.println("Lasttname s'écrit");
	    }

	    @And("il saisit un email valide {string}")
	    public void ilSaisitUnEmailValide(String emailTxt) {
	        registerPage.fillEmail(emailTxt);
	        System.out.println("Email s'écrit");
	    }

	    @And("il saisit un téléphone valide {string}")
	    public void ilSaisitUnTelephoneValide(String phoneNumber) {
	        registerPage.fillPhone(phoneNumber);
	        System.out.println("Téléphone s'écrit");
	    }

	    @And("il saisit un adresse valide {string}")
	    public void ilSaisitUnAdresseValide(String adresse) {
	        registerPage.fillAddresse(adresse);
	        System.out.println("Adresse s'écrit");
	    }

	    @And("il saisit un city valide {string}")
	    public void ilSaisitUnCityValide(String cityTxt) {
	        registerPage.fillCity(cityTxt);
	        System.out.println("City s'écrit");
	    }

	    @And("il saisit un province valide {string}")
	    public void ilSaisitUnProvinceValide(String provinceX) {
	        registerPage.fillProvince(provinceX);
	        System.out.println("Province s'écrit");
	    }

	    @And("il saisit un code postale valide {string}")
	    public void ilSaisitUnCodePostaleValide(String postalCodeTxt) {
	        registerPage.fillcodepostale(postalCodeTxt);
	        System.out.println("Code postale s'écrit");
	    }

	    @And("il saisit un country valide {string}")
	    public void ilSaisitUnCountryValide(String countryTxt) {
	        registerPage.fillCountry(countryTxt);
	        System.out.println("Country s'écrit");
	    }

	    @And("il saisit un username valide {string}")
	    public void ilSaisitUnUsernameValide(String usernameTxt) {
	        registerPage.fillUsername(usernameTxt);
	        System.out.println("Username s'écrit");
	    }

	    @And("il saisit un password valide {string}")
	    public void ilSaisitUnPasswordValide(String passwordtxt) {
	        registerPage.fillPasswordtxt(passwordtxt);
	        System.out.println("Password s'écrit");
	    }

	    @And("il confirme le password {string}")
	    public void ilConfirmeLePassword(String confirmPassword) {
	        registerPage.fillconfirmpasswordtxt(confirmPassword);
	        System.out.println("ConfirmMpotdepasse s'écrit");
	    }

	    @And("il clique sur {string}")
	    public void ilCliqueSur(String btnsubmit) {
	    	registerPage.clickbtnsubmit();
	    	System.out.println("Submit");
	    	}

	    @Then("le compte est créé avec succès") 
	    public void leCompteEstCreeAvecSucces() {
	     assertTrue(registerPage.welcomeMsgIsDisplayed()); 
	     }
	    
	    @And("un message de confirmation est affiché {string}")
	    public void unMessageDeConfirmationEstAffiche(String text) {
	    String actualMessage = registerPage.getWelcomeMessage(); 
	    assertEquals(text, actualMessage);
	    }

 
		

	}


