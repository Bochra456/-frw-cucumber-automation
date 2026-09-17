package com.e2etests.automation.step_definitions;

	
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.e2etests.automation.page_objects.AuthentificationPage;


	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;

	public class AuthentificationStepDefinitions {
		
		private AuthentificationPage authentificationPage ;

		public AuthentificationStepDefinitions () {
			this.authentificationPage = new AuthentificationPage();
		}

		@Given("je me connect a l application swagLabs")
		public void jeMeConnectALApplicationSwagLabs() {
		    authentificationPage.login_valide();
		}

		@Then("je me redirige vers la page d acceuil {string}")
		public void jeMeRedirigeVersLaPageDAcceuil(String title) {
		    assertEquals(title, authentificationPage.getTitlePage());
		}

		@Given("je me connect a l application swagLabs avec non correct coordonnes")
		public void jeMeConnectALApplicationSwagLabsAvecNonCorrectCoordonnes() {
		    authentificationPage.login_Invalide();
		}

		@Then("un message d erreur s affiche {string}")
		public void unMessageDErreurSAffiche(String message) {
		    assertEquals(message, authentificationPage.getErrorMessage());
		}

	}



