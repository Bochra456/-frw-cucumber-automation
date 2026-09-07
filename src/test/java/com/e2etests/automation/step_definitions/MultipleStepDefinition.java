package com.e2etests.automation.step_definitions;

	
import static org.junit.jupiter.api.Assertions.assertTrue;


import com.e2etests.automation.page_objects.MultiplePage;
	import com.e2etests.automation.utils.Setup;


import io.cucumber.java.en.*;
	
	public class MultipleStepDefinition{
		private MultiplePage multiplePage ;
	
	public MultipleStepDefinition() {
		this.multiplePage = new MultiplePage();
	
	}


	    @Given("l utilisateur est sur la page d inscription de l application mercury")
	    public void openMultiplePage(){

	        Setup.getDriver().get("https://demo.guru99.com/test/newtours/register.php");
	    }


		@When("il saisit un first name valide pour multiple {string}")
		public void ilSaisitUnFirstnameValidepourmultiple(String firstname) {
			multiplePage.fillFirstname(firstname);
			System.out.println("Firstname s'écrit");
		}

		@When("il saisit un last name valide pour multiple {string}")
		public void ilSaisitUnLastnameValidepourmultiple(String lastname) {
			multiplePage.fillLastname(lastname);
			System.out.println("Lasttname s'écrit");
		}

		@When("il saisit un email valide pour multiple {string}")
		public void ilSaisitUnEmailValidepourmultiple(String username) {
			multiplePage.fillemail(username);
			System.out.println("Email s'écrit");
		}

		@When("il saisit un téléphone valide pour multiple {string}")
		public void ilSaisitUnTelephoneValidepourmultiple(String phone) {
			multiplePage.fillPhone(phone);
			System.out.println("Téléphone s'écrit");
		}

		@When("il saisit un adresse valide pour multiple {string}")
		public void ilSaisitUnAdresseValidepourmultiple(String adresse) {
			multiplePage.fillAdresseX(adresse);
			System.out.println("Adresse s'écrit");
		}

		@When("il saisit un gouvernerat valide pour multiple {string}")
		public void ilSaisitUngouverneratValidepourmultiple(String cityX) {
			multiplePage.fillCity(cityX);
			System.out.println("City s'écrit");
		}

		@When("il saisit un province valide pour multiple {string}")
		public void ilSaisitUnProvinceValidepourmultiple(String city) {
			multiplePage.fillProvince(city);
			System.out.println("Province s'écrit");
		}

		@When("il saisit un code postale valide pour multiple {string}")
		public void ilSaisitUncodepostaleValidepourmultiple(String codepostaleX) {
			multiplePage.fillcodepostale(codepostaleX);
			System.out.println("Code postale s'écrit");
		}

		@When("il saisit un pays de residence valide pour multiple {string}")
		public void ilSaisitUnpaysderesidenceValidepourmultiple(String countryX) {
			multiplePage.fillCountry(countryX);
			System.out.println("Country s'écrit");
		}

		@When("il saisit un UserName valide pour multiple {string}")
		public void ilSaisitUnUserNameValidepourmultiple(String email) {
			multiplePage.fillUsername(email);
			System.out.println("Username s'écrit");
		}

		@When("il saisit un mot de passe valide pour multiple {string}")
		public void ilSaisitUnmotdepasseValidepourmultiple(String passwordtxt) {
			multiplePage.fillpassword(passwordtxt);
			System.out.println("Password s'écrit");
		}

		@When("il confirme le mot de passe pour multiple {string}")
		public void ilconfirmeLemotdepassepourmultiple(String ConfirmPassword) {
			multiplePage.confirmPasswordTXT(ConfirmPassword);
			System.out.println("ConfirmMpotdepasse s'écrit");
		}

		@When("il clique sur le bouton {string}")
			public void ilCliqueSurleboutonenvoyer(String bouton) {
			    multiplePage.clickenvoyer();
			}
			   
		@Then("un message de confirmation est affiché deux fois {string}")
		public void unMessageDeConfirmationEstAffichedeuxfois(String text) {
			String actualMessage = multiplePage.getSuccesSMsg();
			assertTrue(actualMessage.contains(text));
		}
   
	}


